package scheduler;

public class Shift {

    private String shiftName;
    private WorkProfile requiredWorkProfile = new WorkProfile();
    private Time time;
    private Employee assignedEmployee;
    private int coverage;

    public Shift(){

    }

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

    public void setRequiredWorkProfile(Area area, Rank rank) {
        requiredWorkProfile.setArea(area);
        requiredWorkProfile.setRank(rank);
    }

    public void setRequiredWorkProfile(String area, String rank) {
        requiredWorkProfile.setArea(Area.valueOf(area));
        requiredWorkProfile.setRank(Rank.valueOf(rank));
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setTime(int start, int end) {
        time.setStartTime(start);
        time.setEndTime(end);
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
