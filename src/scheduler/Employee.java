package scheduler;

import java.util.ArrayList;
import java.util.List;

/**
 * Employee class contains necessary content to assign an employee to a shift. Includes: String name, String id,
 *     long phoneNumber, List<WorkProfile> workProfiles, Availability availability, int hoursScheduled, int hourCap,
 *     boolean overtime, boolean taps
 */
public class Employee {

    private String name;
    private String id;
    private long phoneNumber;
    private List<WorkProfile> workProfiles;
    private Availability availability;
    private int hoursScheduled;
    private int hourCap;
    private boolean overtime;
    private boolean taps;

    /**
     * Default constructor
     */
    public Employee() {

    }
    /**
     * Non-default constructor without maxHours; without availability
     */
    public Employee(String name, String id, long phoneNumber, WorkProfile profile) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.workProfiles = new ArrayList<WorkProfile>();
        this.workProfiles.add(profile);
        this.hourCap = 30;
        this.overtime = false;
        this.taps = false;
        this.availability = new Availability();
    }

    /**
     * Non-default constructor with maxHours without availability
     * @param name
     * @param id
     * @param phoneNumber
     * @param profile
     * @param maxHours
     */
    public Employee(String name, String id, long phoneNumber, WorkProfile profile, int maxHours) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.workProfiles = new ArrayList<WorkProfile>();
        this.workProfiles.add(profile);
        this.hourCap = maxHours;
        this.overtime = false;
        this.taps = false;
        this.availability = new Availability();
    }

    /**
     * Non-default constructor with everything.
     * @param name
     * @param id
     * @param phoneNumber
     * @param profile
     * @param maxHours
     * @param a
     */
    public Employee(String name, String id, long phoneNumber, WorkProfile profile, int maxHours, Availability a) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.workProfiles = new ArrayList<WorkProfile>();
        this.workProfiles.add(profile);
        this.hourCap = maxHours;
        this.availability = a;
        this.overtime = false;
        this.taps = false;
        this.availability = new Availability();
    }

    /**
     * Takes employee contents and turns it all into a string.
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", hoursScheduled=" + hoursScheduled +
                ", hourCap=" + hourCap +
                ", overtime=" + overtime +
                '}';
    }

    /**
     * Returns name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns id
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * sets id
     * @param id
     */
    public void setId (String id) {
        this.id = id;
    }

    /**
     * returns phoneNumber
     * @return
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * sets phoneNumber
     * @param phoneNumber
     */
    public void setPhoneNumber(long phoneNumber) {
        //this should probably have some restraints on phoneNumber values
        this.phoneNumber = phoneNumber;
    }

    /**
     * returns workProfiles
     * @return
     */
    public List<WorkProfile> getWorkProfile() {
        return workProfiles;
    }

    /**
     * sets workProfiles
     */
    public void setWorkProfile(List<WorkProfile> workProfiles) {
        this.workProfiles = workProfiles;
    }

    /**
     * returns availability
     * @return
     */
    public Availability getAvailability() {
        return availability;
    }

    /**
     * sets availability
     * @param availability
     */
    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    /**
     * returns hoursScheduled
     * @return
     */
    public int getHoursScheduled() {
        return hoursScheduled;
    }

    /**
     * sets hoursScheduled
     * @param hoursScheduled
     */
    public void setHoursScheduled(int hoursScheduled) {
        this.hoursScheduled = hoursScheduled;
    }

    /**
     * returns hourCap
     * @return
     */
    public int getHourCap() {
        return hourCap;
    }

    /**
     * returns overtime
     * @return
     */
    public boolean getOvertime() {
        return overtime;
    }

    /**
     * sets the overtime
     * @param flag
     */
    public void setOvertime(boolean flag) {
        this.overtime = flag;
    }

    /**
     * Sets the hourCap
     * @param hourCap
     */
    public void setHourCap(int hourCap) {
        if(hourCap <= 40 || overtime)
            this.hourCap = hourCap;
        else {
            System.out.println("Hour cap must be 40 hrs or less.");
        }
    }

    /**
     * Returns the taps
     * @return
     */
    public boolean getTaps() {
        return taps;
    }

    /**
     * Sets the taps
     * @param taps
     */
    public void setTaps(boolean taps) {
        this.taps = taps;
    }

    /**
     * Switchs the taps to their opposite boolean value.
     */
    public void switchTaps() {
        taps = !taps;
    }

    /**
     * Returns the total hours of availability
     * @return
     */
    public int getTotalHours() {
        return availability.getTotalHours();
    }

    /**
     * Takes a Day and Shift and then determines if an employee can work that shift. Returns a boolean.
     * @param d
     * @param s
     * @return
     */
    public boolean canWork(Day d, Shift s) {
        Time employeeTime = availability.getDay(d);
        Time shiftTime = s.getTime();
        if(employeeTime.getStartTime() == 0) {
            return false;
        }
        else if(employeeTime.getStartTime() <= shiftTime.getStartTime()
                && employeeTime.getEndTime() >= shiftTime.getEndTime()) {
            if(hoursScheduled + s.getTime().getTotalHours() < hourCap) {
                return true;
            }
        }
            return false;
    }
}
