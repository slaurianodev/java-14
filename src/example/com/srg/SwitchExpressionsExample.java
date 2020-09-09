package example.com.srg;

public class SwitchExpressionsExample {
    enum WEEK_DAYS { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};

    private static String switchTraditional(WEEK_DAYS dayOfWeek) {
        String result = null;

        switch (dayOfWeek){
            case  MONDAY:
            case  TUESDAY:
            case  WEDNESDAY:
            case  THURSDAY:
            case  FRIDAY:
                result = "Work day";
                break;
            case SATURDAY:
            case SUNDAY:
                result = "Rest day";
                break;
            default: result ="Invalid";
        }
        return result;
    }

    private static String switchJava14(WEEK_DAYS dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                yield "Work day";
            case SATURDAY:
            case SUNDAY:
                yield "Rest day";
        };
    }

    private static String switchEnhanced(WEEK_DAYS dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Work day";
            case SATURDAY, SUNDAY -> "Rest day";
        };
    }

    public static void main(String[] args) {
        System.out.println(switchEnhanced(WEEK_DAYS.MONDAY));
    }

}
