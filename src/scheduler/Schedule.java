package scheduler;

import java.util.HashMap;
import java.util.Map;

public class Schedule {
    private Map<Day, DayProfile> schedule = new HashMap<>();

    public Schedule() {
        schedule = new HashMap<Day, DayProfile>();
    }

    public void addDayProfile(Day day, DayProfile dayProfile) {
        //This will accept the day of week that the new profile is to be created for and the name
        //that the new profile will be known as. We should verify that there are no others of the
        //same name.
        if(schedule.get(day) != null) {
            System.err.println("There is already a day profile for that day.");
        }
        schedule.put(day, dayProfile);
    }

    public void addDayProfile(String day, DayProfile dayProfile) {
        //This will accept the day of week that the new profile is to be created for and the name
        //that the new profile will be known as. We should verify that there are no others of the
        //same name.
        if(!schedule.get(Day.valueOf(day)).equals(null)) {
            System.err.println("There is already a day profile for that day.");
        }
        schedule.put(Day.valueOf(day), dayProfile);
    }

    public DayProfile getDayProfile(Day day) {
        //This show profiles matching the sent day
        return schedule.get(day);
    }

    public void removeDayProfile(Day day, DayProfile dayProfile) {
        //This should check the sent day for the sent dayProfile, if there is an instance that
        //matches, it will remove that profile (maybe an "are you sure you want to..." message
        //would be appropriate.
        schedule.remove(day);
    }

    @Override
    public String toString() {
        String s = "";
        for(DayProfile profile: schedule.values()) {
            for(Shift shift: profile.getShifts()) {
                s += shift + "\n";
            }
        }
        return s;
    }
}
