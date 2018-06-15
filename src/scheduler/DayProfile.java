package scheduler;

import java.util.List;

public class DayProfile {
    String label;
    List<Shift> shifts;
    Day day;
    Boolean isHoliday;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void removeShift(String shiftName) {
        //sift through list of shifts. If shiftName == one of the items, remove it.
    }

    public void addShift(String shiftName) {
        //sift through list of shifts. If shiftName != one of the items, add it.
        //Otherwise, inform user that it is already being used.
    }

    public void getShifts() {
        //Sift through shifts.
    }

    public Boolean getHoliday() {
        return isHoliday;
    }

    public void setHoliday(Boolean isHoliday) {
        this.isHoliday = isHoliday;
    }

    public void assignEmployee(Shift shift, Employee employee) {
        //will receive data and determine who should fill this role.
    }
}
