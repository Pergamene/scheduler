package scheduler;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Availability {

    private Map<Day, Time> availableDays;
    private int totalHours;
    private List<Date> ro;

    public Availability() {
        availableDays = new TreeMap<Day, Time>();
        totalHours = 0;
    }

    public void addAvailableDay(Day d, Time t) {
        availableDays.put(d, t);
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void requestTimeOff() {

    }

    private void updateTotalHours() {
        totalHours = 0;
        for(Time t: availableDays.values()) {
            totalHours += t.getTotalHours();
        }
    }
}