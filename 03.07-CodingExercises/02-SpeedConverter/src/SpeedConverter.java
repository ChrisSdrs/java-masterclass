public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(3.86);
        printConversion(-8934);
        printConversion(7356);
        printConversion(34632.134);
        printConversion(-2344564);
        printConversion(567656);
        printConversion(-455345);
        printConversion(324432);
        printConversion(8564);
        printConversion(87867564);
        printConversion(-897564);
        printConversion(8675);
        printConversion(43564);
        printConversion(-98664);
        printConversion(87867564);
        printConversion(75647564);
        printConversion(8574);
    }
    public static long toMilesPerHour(double kilometersperhour){

        if (kilometersperhour < 0) {
            return -1;
        }else {
            return Math.round(kilometersperhour / 1.609);
        }
    }
    public static void printConversion(double kilometersperhour){
        if (kilometersperhour < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersperhour + " km/h = " +
                    toMilesPerHour(kilometersperhour) + " mi/h");
        }
    }
}
