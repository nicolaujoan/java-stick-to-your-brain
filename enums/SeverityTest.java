import javax.sound.sampled.SourceDataLine;

public class SeverityTest {
    public static void main(String[] args) {

        /** EX1) */

        // assigning values to variables of Severity enum type
        Severity low = Severity.LOW;
        Severity medium = Severity.MEDIUM;
        Severity high = Severity.HIGH;
        Severity urgent = Severity.URGENT;

        // they can be null too
        Severity unknown = null;

        // Severity badAttempt = new Severity(); compile time error, cannot be
        // instantiated

        /** EX2) */
        // listing names and ordinals of enum type constants

        for (Severity s : Severity.values()) {
            String name = s.name();
            int ordinal = s.ordinal();
            System.out.println(name + "(" + ordinal + ")");
        }

        /** EX3) */
        // using compareTo() method
        Severity s1 = Severity.LOW;
        Severity s2 = Severity.HIGH;

        // s1.compareTO(S2) returns s1.ordinal() - s2.ordinal()
        int diff = s1.compareTo(s2);

        if (diff > 0) {
            System.out.println(s1 + " occurs after " + s2);
        } else {
            System.out.println(s1 + " occurs before " + s2);
        }

    }

    /** EX4) */
    // using switch statement
    public static int getProjectTurnaroundDays(Severity severity) {
        int days = 0;
        switch (severity) {
            case LOW: // MUST USE THE UNQUALIFIED NAME LOW not Severity.LOW
                days = 30;
                break;

            case MEDIUM:
                days = 15;
                break;

            case HIGH:
                days = 7;
                break;

            case URGENT:
                days = 3;
                break;
        }
        return days;
    }
}
