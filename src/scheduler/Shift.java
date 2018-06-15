package scheduler;

public class Shift {

    String shiftName;
    WorkProfile requiredWorkProfile;
    Time time;
    Employee assignedEmployee;

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
}
