package scheduler;

public class Shift {

    private String shiftName;
    private WorkProfile requiredWorkProfile;
    private Time time;
    private Employee assignedEmployee;
    private int coverage;

    public Shift(String shiftName, WorkProfile requiredWorkProfile, Time time) {
        this.shiftName = shiftName;
        this.requiredWorkProfile = requiredWorkProfile;
        this.time = time;
        this.assignedEmployee = null;
        this.coverage = 0;
    }

    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    public WorkProfile getRequiredWorkProfile() {
        return requiredWorkProfile;
    }

    public void setRequiredWorkProfile(WorkProfile requiredWorkProfile) {
        this.requiredWorkProfile = requiredWorkProfile;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }

    public void setAssignedEmployee(Employee assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }

    public void incrementCoverage() {
        coverage++;
    }

    public int getCoverage() {
        return coverage;
    }
}
