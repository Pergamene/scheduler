package scheduler;

import java.util.List;

public class Employee {
    String name;
    int ID;
    int phoneNumber;
    List<WorkProfile> workProfiles;
    Availability availability;
    int hoursScheduled;
    int hourCap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID (int ID) {
        this.ID = ID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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

    public void setHourCap(int hourCap) {
        if(hourCap <= 40)
            this.hourCap = hourCap;
        else {
            System.out.println("Hour cap must be 40 hrs or less.");
        }
    }
}
