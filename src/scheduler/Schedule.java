package scheduler;

public class Schedule {
    Map <ENUM, DayProfile>

    public void addDayProfile(Day day, DayProfile dayProfile) {
        //This will accept the day of week that the new profile is to be created for and the name
        //that the new profile will be known as. We should verify that there are no others of the
        //same name.
    }

    public DayProfile getDayProfile(Day day) {
        //This show profiles matching the sent day
    }

    public void removeDayProfile(Day day, DayProfile dayProfile) {
        //This should check the sent day for the sent dayProfile, if there is an instance that
        //matches, it will remove that profile (maybe an "are you sure you want to..." message
        //would be appropriate.
    }
}
