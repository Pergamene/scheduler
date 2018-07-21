package scheduler;

import javax.naming.NamingException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Creates a dayProfile that has a label, a map of shifts, and then day of week that the profile falls on.
 */
public class DayProfile {

    private String label;
    private Map<String, Shift> shifts = new HashMap<>();
    private Day day;

    public DayProfile(String label) {
        this.label = label;
        shifts = new HashMap<String, Shift>();
    }

    /**
     * Default constructor of DayProfile
     */
    public DayProfile() {

    }

    /**
     * Returns the label
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label based on the string sent.
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Removes a shift based on the shiftName String sent.
     * @param shiftName
     */
    public void removeShift(String shiftName) {
        shifts.remove(shiftName);
    }

    /**
     * Adds a shift to the shifts list based on the shift sent.
     */
    public void addShift(Shift shift) {
        //sift through list of shifts. If shiftName != one of the items, add it.
        //Otherwise, inform user that it is already being used.
        if(shifts.put(shift.getShiftName(), shift) != null) {
            System.out.println("Shift is already in use");
        }
        else {
            this.shifts.put(shift.getShiftName(), shift);
        }
    }

    /**
     * Returns the collection of shifts
     * @return
     */
    public Collection<Shift> getShifts() {
        return shifts.values();
    }

    /**
     * Takes and employee and a shift sets the employee as being assigned to the shift.
     * @param shift
     * @param employee
     */
    public void assignEmployee(Shift shift, Employee employee) {
        shifts.get(shift.getShiftName()).setAssignedEmployee(employee);
    }

    /**
     * Sets the day based on a String sent.
     * @param s
     */
    public void setDay(String s) {
        this.day = Day.valueOf(s);
    }

    /*
     * Currently does nothing. Previously displayed all the contents in a System.out. This code was lost.
     */
    public void display() {

    }

    /*
     * Similar issue as that above.
     * @return
     */
    public String display2() {
        return "test";
    }

    /**
     * returns the day.
     * @return
     */
    public Day getDay() {
        return day;
    }
}
