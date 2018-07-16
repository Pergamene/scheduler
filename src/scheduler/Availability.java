package scheduler;

import java.util.ArrayList;
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
        ro = new ArrayList<Date>();
    }

    public void addAvailableDay(Day d, Time t) {
        availableDays.put(d, t);
        updateTotalHours();
    }

    public void updateAvailableDay(Day d, Time t) {
        availableDays.replace(d, t);
        updateTotalHours();
    }

    public int getTotalHours() {
        return totalHours;
    }

    public Time getDay(Day d) {
        return availableDays.get(d);
    }

    public void requestTimeOff(Date date) {
        ro.add(date);
    }

    public void addRequestedTimeOff(List<Date> dates) {
        ro.addAll(dates);
    }

    public int getTimeOff(Date date) {
        for(int i = 0; i < ro.size(); i++) {
            if(ro.get(i).equals(date)) {
                return i;
            }
        }
        return -1;
    }

    public void removeTimeOff(int index) {
        ro.remove(index);
    }

    private void updateTotalHours() {
        totalHours = 0;
        for(Time t: availableDays.values()) {
            totalHours += t.getTotalHours();
        }
    }
}