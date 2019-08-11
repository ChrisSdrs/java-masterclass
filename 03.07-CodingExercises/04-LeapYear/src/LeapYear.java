public class LeapYear {

    public static void main(String[] args) {
        isLeapYear(2019);
        isLeapYear(2016);
        isLeapYear(2020);
        isLeapYear(2027);
        isLeapYear(2000);
        isLeapYear(2400);
        isLeapYear(1865);
        isLeapYear(0);
        isLeapYear(-2000);
        isLeapYear(1864);
        isLeapYear(2200);
        isLeapYear(2100);
        isLeapYear(2400);
    }

    public static void isLeapYear (int year) {

        int leapYear = year % 4;
        int secondLeapYear = year % 100;
        int thirdLeapYear = year % 400;

        if (leapYear == 0 && secondLeapYear != 0 || thirdLeapYear == 0) {
            System.out.println("Year " + year + " is a leap year.");
        } else{
            System.out.println("Year " + year + " is not a leap year.");
        }

    }
}
