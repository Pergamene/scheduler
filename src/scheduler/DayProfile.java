package scheduler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DayProfile {

    private String label;
    private Map<String, Shift> shifts;
    private Day day;


    public DayProfile() {
    }
    public DayProfile(String label, Day day) {
        this.label = label;
        this.day = day;
        shifts = new HashMap<String, Shift>();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    //public void setDay(String day) {

    public void removeShift(String shiftName) {
        shifts.remove(shiftName);
    }

    public void addShift(Shift shift) {
        //sift through list of shifts. If shiftName != one of the items, add it.
        //Otherwise, inform user that it is already being used.
        if(shifts.put(shift.getShiftName(), shift) != null) {
            System.out.println("Shift is already in use");
        } else {
            shifts.put(shift.getShiftName(), shift);
        }
    }

    public Collection<Shift> getShifts() {
        return shifts.values();
    }

    public void setDay(Day day) {this.day = day;}
    public Day getDay() {return day;}
    public void assignEmployee(Shift shift, Employee employee) {
        shifts.get(shift.getShiftName()).setAssignedEmployee(employee);
    }
}
