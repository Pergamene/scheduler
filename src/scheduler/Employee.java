package scheduler;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String ID;
    private long phoneNumber;
    private List<WorkProfile> workProfiles;
    private Availability availability;
    private int hoursScheduled;
    private int hourCap;
    private boolean overtime;

    public Employee() {

    }

    public Employee(String name, String ID, long phoneNumber, WorkProfile profile) {
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        workProfiles = new ArrayList<WorkProfile>();
        workProfiles.add(profile);
        this.overtime = false;
    }

    public Employee(String name, String ID, long phoneNumber, WorkProfile profile, int maxHours) {
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        workProfiles = new ArrayList<WorkProfile>();
        workProfiles.add(profile);
        this.hourCap = maxHours;
        this.overtime = false;
    }

    public Employee(String name, String ID, long phoneNumber, WorkProfile profile, int maxHours, Availability a) {
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        workProfiles = new ArrayList<WorkProfile>();
        workProfiles.add(profile);
        this.hourCap = maxHours;
        this.availability = a;
        this.overtime = false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
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

    public String getID() {
        return ID;
    }

    public void setID (String ID) {
        this.ID = ID;
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
}
