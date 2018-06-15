package scheduler;

public class Shift {
    String shiftName;
    Rank requiredRank;
    Time time;
    Employee assignedEmployee;

    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    public Rank getRequiredRank() {
        return requiredRank;
    }

    public void setRequiredRank(Rank requiredRank) {
        this.requiredRank = requiredRank;
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
