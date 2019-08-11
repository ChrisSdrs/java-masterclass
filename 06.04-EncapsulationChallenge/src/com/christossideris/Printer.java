package com.christossideris;

public class Printer {

    private String model;
    private String manufacturer;
    private float hiddenParameter = 100F;  // Hidden the toner.
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(String model, String manufacturer, float tonerLevel, boolean duplexPrinter) {
        this.model = model;
        this.manufacturer = manufacturer;
        if (tonerLevel <= 100F && tonerLevel >= 0) {
            this.hiddenParameter = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void print(int numberOfPages){
        if (numberOfPages < 0){
            System.out.println("Invalid number of pages.");
        } else {
            float tonerLoss = 0F;
            int printed = 0;
            if (!duplexPrinter) {                            // If Printer is not a duplex printer.
                while (printed < numberOfPages) {
                    if (tonerLoss > (hiddenParameter - 0.8)) {
                        System.out.println("Out of toner!! Print of " + numberOfPages +
                                " pages cannot process. Refill toner and try again.");
                        System.out.println(numberOfPages - printed + " pages unprinted.");
                        break;
                    } else {
                        tonerLoss += 0.8;
                        printed++;
                    }
                }
            } else {                                          // If Printer is a duplex printer.
                while (printed < ((numberOfPages / 2) + (numberOfPages % 2))) {
                    if (tonerLoss > (hiddenParameter - 0.8)) {
                        System.out.println("Out of toner!! Print of " + numberOfPages +
                                " pages cannot process. Refill toner and try again.");
                        System.out.println(numberOfPages - printed + " pages unprinted.");
                        break;
                    } else {
                        tonerLoss += 0.8;
                        printed++;
                    }
                }
            }
            pagesPrinted += printed;
            hiddenParameter = hiddenParameter - tonerLoss;
            if (hiddenParameter <= 20 && hiddenParameter > 10) {
                System.out.println("Printed " + printed + " pages successfully.");
                System.out.println("Total pages printed: " + pagesPrinted);
                System.out.println("Low toner level: " + hiddenParameter + "%");
            } else if (hiddenParameter <= 10 && hiddenParameter > 0.8){
                System.out.println("Printed " + printed + " pages successfully.");
                System.out.println("Total pages printed: " + pagesPrinted);
                System.out.println("Running out of toner!! Toner level: " + hiddenParameter + "%");
            } else {
                System.out.println("Printed " + printed + " pages successfully.");
                System.out.println("Total pages printed: " + pagesPrinted);
                System.out.println("Toner level: " + hiddenParameter + "%");
            }
        }
    }

    public void fillToner(float tonerAmount){
        hiddenParameter = hiddenParameter + tonerAmount;
        if (hiddenParameter > 100){
            hiddenParameter = 100F;
        }
        System.out.println("Toner filled successfully to " + hiddenParameter + "%");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getTonerLevel() {
        return hiddenParameter;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}