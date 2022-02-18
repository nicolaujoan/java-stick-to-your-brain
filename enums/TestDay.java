import java.util.EnumSet;

public class TestDay {
    public static void main(String[] args) {
        // get all constants of the Day enum
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        print(allDays, "All days: ");

        // get all days from monday to fridayof the Day enum
        EnumSet<Day> weekDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        print(weekDays, "WeekDays: ");

        // get all constants that are not from monday to friday
        // we want the weekendDays

        EnumSet<Day> weekendDays = EnumSet.complementOf(weekDays);
        print(weekendDays, "Weekends: ");
    }

    public static void print(EnumSet<Day> days, String msg) {
        System.out.print(msg);
        for(Day d : days) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
