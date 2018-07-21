package scheduler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Creates a map of Day and DayProfile. This makes it easier to search through days to find the appropriate profile.
 */
public class Schedule {
    private Map<Day, DayProfile> schedule = new HashMap<>();

    /**
     * Default constructor
     */
    public Schedule() {
        schedule = new HashMap<Day, DayProfile>();
    }

    /**
     * Adds a day and dayProfile to the Schedule map. It checks to make sure that values have not been sent previously.
     * @param day
     * @param dayProfile
     */
    public void addDayProfile(Day day, DayProfile dayProfile) {
        //This will accept the day of week that the new profile is to be created for and the name
        //that the new profile will be known as. We should verify that there are no others of the
        //same name.
        if(schedule.get(day) != null) {
            System.err.println("There is already a day profile for that day.");
        }
        schedule.put(day, dayProfile);
    }

    /**
     * Adds a day(string) and dayProfile to the Schedule map. It checks to make sure that values have not been sent
     * previously.
     * @param day
     * @param dayProfile
     */
    public void addDayProfile(String day, DayProfile dayProfile) {
        //This will accept the day of week that the new profile is to be created for and the name
        //that the new profile will be known as. We should verify that there are no others of the
        //same name.
        if(!schedule.get(Day.valueOf(day)).equals(null)) {
            System.err.println("There is already a day profile for that day.");
        }
        schedule.put(Day.valueOf(day), dayProfile);
    }

    /**
     * Returns the dayProfile based on the day sent.
     * @param day
     * @return
     */
    public DayProfile getDayProfile(Day day) {
        //This show profiles matching the sent day
        return schedule.get(day);
    }

    /**
     * Removes an entry into schedule based on day/dayProfile sent.
     * @param day
     * @param dayProfile
     */
    public void removeDayProfile(Day day, DayProfile dayProfile) {
        //This should check the sent day for the sent dayProfile, if there is an instance that
        //matches, it will remove that profile (maybe an "are you sure you want to..." message
        //would be appropriate.
        schedule.remove(day);
    }

    public List<String> format() {
        List<String> shiftsList = new ArrayList<String>();
        for(DayProfile profile: schedule.values()) {
            for(Shift shift: profile.getShifts()) {
                shiftsList.add(shift.toString());
            }
        }
        return shiftsList;
    }

    @Override
    public String toString() {
        String s = "";
        List<String> strings = format();
        for(String s1: strings) {
            s += s1 + "\n";
        }
        return s;
    }
}
