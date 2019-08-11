public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(2343L));
        System.out.println(getDurationString(53454L));
        System.out.println(getDurationString(4213L));
        System.out.println(getDurationString(3600L));
        System.out.println(getDurationString(7200L));
        System.out.println(getDurationString(-34534L));
        System.out.println(getDurationString(534L,-24L));
        System.out.println(getDurationString(-756L,47L));
        System.out.println(getDurationString(-3532L,-32L));
        System.out.println(getDurationString(-5343L,7654L));
        System.out.println(getDurationString(-24232L,-8645L));
    }

    private static String getDurationString (long minutes, long seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + " h, ";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }
        String minutesString = remainingMinutes + " m, ";
        if (remainingMinutes < 10){
           minutesString = "0" + minutesString;
        }
        String secondsString = seconds + " m, ";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString;
    }
    public static String getDurationString (long seconds){
        if (seconds <= 0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
    private static final String INVALID_VALUE_MESSAGE = "Invalid value.";

}
