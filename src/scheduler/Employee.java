package scheduler;

import java.util.List;

public class Employee {
    String name;
    int ID;
    int phoneNumber;
    List<Rank> rank;
    Availability availability;
    int hoursScheduled;
    int hourCap;

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() { return ID; }

    public void setID (int ID) { this.ID = ID; }

    public int getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(int phoneNumber) {
        //this should probably have some restraints on phoneNumber values
        this.phoneNumber = phoneNumber;
    }
    public Rank getRank() {
        return rank;
    }

    public Rank setRank(Rank rank) {
        this.rank = rank;
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
        if(hourCap < 41)
            this.hourCap = hourCap;
        else {
            System.out.println("Hour cap must be 40 hrs or less.");
        }
    }
}
