// SmartSeverity enum type which uses fields, constructors and Methods

public enum SmartSeverity {
    LOW(30), MEDIUM(15), HIGH(7), URGENT(1);
    
    // declare an instance variable
    private int projectedTurnaroundDays;

    // declare a private constructor
    private SmartSeverity(int projectedTurnaroundDays) {
        this.projectedTurnaroundDays = projectedTurnaroundDays;
    }

    // declare a public method to get the projectTurnaroundDays
    public int getProjectedTurnaroundDays() {
        return projectedTurnaroundDays;
    }

    
    
}
