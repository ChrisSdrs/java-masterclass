public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        System.out.println(minutesToYearsAndDays(525600L));
        System.out.println(minutesToYearsAndDays(1051200L));
        System.out.println(minutesToYearsAndDays(561600L));
        System.out.println(minutesToYearsAndDays(0L));
        System.out.println(minutesToYearsAndDays(-3467L));
        System.out.println(minutesToYearsAndDays(78978464546L));
    }

    public static String minutesToYearsAndDays(long minutes){
        if (minutes < 0){
            return "Invalid value";
        }
        long days = minutes / 1440;
        long years = days / 365;
        long remainingDays = days % 365;
        return minutes + " min = " + years + " y, " + remainingDays + " d";

    }
}
