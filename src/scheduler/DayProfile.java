package scheduler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DayProfile {

    private String label;
    private Map<String, Shift> shifts;

    public DayProfile(String label) {
        this.label = label;
        shifts = new HashMap<String, Shift>();
    }

    public DayProfile() {

    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void removeShift(String shiftName) {
        shifts.remove(shiftName);
    }

    public void addShift(Shift shift) {
        //sift through list of shifts. If shiftName != one of the items, add it.
        //Otherwise, inform user that it is already being used.
        if(shifts.put(shift.getShiftName(), shift) != null) {
            System.out.println("Shift is already in use");
        }
    }

    public Collection<Shift> getShifts() {
        return shifts.values();
    }

    public void assignEmployee(Shift shift, Employee employee) {
        shifts.get(shift.getShiftName()).setAssignedEmployee(employee);
    }
}
