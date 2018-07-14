package scheduler;

import java.util.ArrayList;
import java.util.List;

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

    public Employee() {

    }

    public Employee(String name, String id, long phoneNumber, WorkProfile profile) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.workProfiles = new ArrayList<WorkProfile>();
        this.workProfiles.add(profile);
        this.hourCap = 30;
        this.overtime = false;
        this.taps = false;
    }

    public Employee(String name, String id, long phoneNumber, WorkProfile profile, int maxHours) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.workProfiles = new ArrayList<WorkProfile>();
        this.workProfiles.add(profile);
        this.hourCap = maxHours;
        this.overtime = false;
        this.taps = false;
    }

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
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        //this should probably have some restraints on phoneNumber values
        this.phoneNumber = phoneNumber;
    }

    public List<WorkProfile> getWorkProfile() {
        return workProfiles;
    }

    public void setWorkProfile(List<WorkProfile> workProfiles) {
        this.workProfiles = workProfiles;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public int getHoursScheduled() {
        return hoursScheduled;
    }

    public void setHoursScheduled(int hoursScheduled) {
        this.hoursScheduled = hoursScheduled;
    }

    public int getHourCap() {
        return hourCap;
    }

    public void setOvertime(boolean flag) {
        this.overtime = flag;
    }

    public void setHourCap(int hourCap) {
        if(hourCap <= 40 || overtime)
            this.hourCap = hourCap;
        else {
            System.out.println("Hour cap must be 40 hrs or less.");
        }
    }

    public boolean getTaps() {
        return taps;
    }

    public void switchTaps() {
        taps = !taps;
    }

    public int getTotalHours() {
        return availability.getTotalHours();
    }

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
