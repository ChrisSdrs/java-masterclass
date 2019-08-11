public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(2048);
        printMegaBytesAndKiloBytes(3456278);
        printMegaBytesAndKiloBytes(-324);
        printMegaBytesAndKiloBytes(420000);
        printMegaBytesAndKiloBytes(430080);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(1000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int remainingKilobytes = kiloBytes % 1024;
            int megaBytes = (int) (0.0009765625 * kiloBytes);
            System.out.println(kiloBytes + " KB = " +
                    megaBytes + " MB " + remainingKilobytes +
                    " KB");
        }
    }
}
