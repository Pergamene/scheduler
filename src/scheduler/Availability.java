package scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Availabilty contains when a shift or person is available, the total hours scheduled and ro (the requested time off)
 */
public class Availability {

    private Map<Day, Time> availableDays;
    private int totalHours;
    private List<Date> ro; //requested time off

    /**
     * Default constructor to set up the availability with nothing in it.
     */
    public Availability() {
        availableDays = new TreeMap<Day, Time>();
        totalHours = 0;
        ro = new ArrayList<Date>();
    }

    /**
     * Returns availableDays
     * @return
     */
    public Map<Day, Time> getAvailableDays() {
        return availableDays;
    }

    /**
     * Receives a day and time and then adds them to the availableDays list.
     * Also updates total hours to keep track of them.
     * @param d
     * @param t
     */
    public void addAvailableDay(Day d, Time t) {
        availableDays.put(d, t);
        updateTotalHours();
    }

    /**
     * Receives a day and time then uses them to replace an existing one.
     * Also updates total hours to keep track of them.
     * @param d
     * @param t
     */
    public void updateAvailableDay(Day d, Time t) {
        availableDays.replace(d, t);
        updateTotalHours();
    }

    /**
     * Returns totalHours
     * @return
     */
    public int getTotalHours() {
        return totalHours;
    }

    /**
     * Returns an availability based on the day sent.
     * @param d
     * @return
     */
    public Time getDay(Day d) {
        return availableDays.get(d);
    }

    /**
     * Sent a date that the employee wants off.
     * @param date
     */
    public void requestTimeOff(Date date) {
        ro.add(date);
    }

    /**
     * Adds multiple dates an employee wants off.
     * @param dates
     */
    public void addRequestedTimeOff(List<Date> dates) {
        ro.addAll(dates);
    }

    /**
     * Returns the requested time off.
     * @return
     */
    public List<Date> getRo() {
        return ro;
    }

    /*public int needTimeOff(Date date) {
        for(int i = 0; i < ro.size(); i++) {
            if(ro.get(i).equals(date)) {
                return i;
            }
        }
        return -1;
    }*/

    /**
     * Removes time off for a specified index of ro.
     * @param index
     */
    public void removeTimeOff(int index) {
        ro.remove(index);
    }

    /**
     * Updates the total hours of an employee by going through the availableDays and adding up total hours.
     */
    private void updateTotalHours() {
        totalHours = 0;
        for(Time t: availableDays.values()) {
            totalHours += t.getTotalHours();
        }
    }
}