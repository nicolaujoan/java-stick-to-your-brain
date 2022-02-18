public class SmartSeverityTest {
    public static void main(String[] args) {
        // print names of constants, ordinals and proejcted turnaround days
        for (SmartSeverity s : SmartSeverity.values()) {
            String name = s.name();
            int ordinal = s.ordinal();
            int days = s.getProjectedTurnaroundDays();

            System.out.println("name: " + name + 
                                ", ordinal: " + ordinal + 
                                ", days: " + days);
        }
    }
}
