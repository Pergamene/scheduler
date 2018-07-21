package scheduler;

/**
 * Creates a Shift that contains a shiftName, requiredWorkProfile, time, assigned Employee, and coverage. This is the
 * basic unit that needs to be filled by an assigned Employee for our schedule.
 */
public class Shift {

    private String shiftName;
    private WorkProfile requiredWorkProfile = new WorkProfile();
    private Time time = new Time();
    private Employee assignedEmployee;
    private int coverage;

    /**
     * Default constructor
     */
    public Shift(){

    }

    /**
     * Non-Default constructor without assignedEmployee and coverage.
     * @param shiftName
     * @param requiredWorkProfile
     * @param time
     */
    public Shift(String shiftName, WorkProfile requiredWorkProfile, Time time) {
        this.shiftName = shiftName;
        this.requiredWorkProfile = requiredWorkProfile;
        this.time = time;
        this.assignedEmployee = null;
        this.coverage = 0;
    }

    /**
     * Returns the shiftName.
     * @return
     */
    public String getShiftName() {
        return shiftName;
    }

    /**
     * Sets the shiftName.
     * @param shiftName
     */
    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    /**
     * Returns the requiredWorkProfile
     * @return
     */
    public WorkProfile getRequiredWorkProfile() {
        return requiredWorkProfile;
    }

    /**
     * Sets the requiredWorkProfile after receiving a WorkProfile
     * @param requiredWorkProfile
     */
    public void setRequiredWorkProfile(WorkProfile requiredWorkProfile) {
        this.requiredWorkProfile = requiredWorkProfile;
    }

    /**
     * Sets the requiredWorkProfile after receiving an Area and Rank
     * @param area
     * @param rank
     */
    public void setRequiredWorkProfile(Area area, Rank rank) {
        requiredWorkProfile.setArea(area);
        requiredWorkProfile.setRank(rank);
    }

    /**
     * Sets the requiredWorkProfile after receiving a String(area) and String(rank)
     * @param area
     * @param rank
     */
    public void setRequiredWorkProfile(String area, String rank) {
        requiredWorkProfile.setArea(Area.valueOf(area));
        requiredWorkProfile.setRank(Rank.valueOf(rank));
    }

    /**
     * Returns the time
     * @return
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the time
     * @param time
     */
    public void setTime(Time time) {
        this.time = time;
    }

    /**
     * Receives a start and end time(ints) and then sets them.
     * @param start
     * @param end
     */
    public void setTime(int start, int end) {
        time.setStartTime(start);
        time.setEndTime(end);
    }

    /**
     * Returns the assignedEmployee
     * @return
     */
    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }

    /**
     * Sets the assignedEmployee
     * @param assignedEmployee
     */
    public void setAssignedEmployee(Employee assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }

    /**
     * Increases coverage by 1
     */
    public void incrementCoverage() {
        coverage++;
    }

    /**
     * Returns the coverage.
     * @return
     */
    public int getCoverage() {
        return coverage;
    }

    /**
     * Returns shift contents in a String.
     * @return
     */
    @Override
    public String toString() {
        return "Shift{" +
                "shiftName='" + shiftName + '\'' +
                ", assignedEmployee=" + assignedEmployee +
                '}';
    }
}
