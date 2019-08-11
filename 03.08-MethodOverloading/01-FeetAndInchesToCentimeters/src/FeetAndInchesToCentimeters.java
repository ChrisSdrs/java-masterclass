public class FeetAndInchesToCentimeters {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if (centimeters < 0.0){
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(864);
        calcFeetAndInchesToCentimeters(345);
        calcFeetAndInchesToCentimeters(1212);
        calcFeetAndInchesToCentimeters(6332);
        calcFeetAndInchesToCentimeters(-34);
        calcFeetAndInchesToCentimeters(654);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;

        if (feet >= 0 && inches >= 0 && inches <= 12){
            System.out.println(feet + " feet, " + inches + " inches = " +
                    centimeters + " cm");
            return centimeters;
        }else {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters (double inches){

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        if (inches >= 0){
            System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }else return -1;

    }
}
