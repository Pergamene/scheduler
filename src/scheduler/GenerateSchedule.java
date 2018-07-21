package scheduler;

import java.util.ArrayList;
import java.util.List;

public class GenerateSchedule {

    private List<Employee> employeesByAvailableHours;
    private List<Employee> employeesByHoursScheduled;
    private Schedule schedule;
    private List<List<Shift>> weekByCoverage = new ArrayList<>();
    private List<Shift> sByCoverage = new ArrayList<>();
    private List<Shift> mByCoverage = new ArrayList<>();
    private List<Shift> tByCoverage = new ArrayList<>();
    private List<Shift> wByCoverage = new ArrayList<>();
    private List<Shift> thByCoverage = new ArrayList<>();
    private List<Shift> fByCoverage = new ArrayList<>();
    private List<Shift> saByCoverage = new ArrayList<>();

    /**
     * Default constructor.
     * @param employees
     * @param schedule
     */
    public GenerateSchedule(List<Employee> employees, Schedule schedule) {
        this.employeesByAvailableHours = new ArrayList<Employee>(employees);
        this.employeesByHoursScheduled = new ArrayList<Employee>(employees);
        updateEmployeesByAvailableHours();
        updateEmployeesByHoursScheduled();
        this.schedule = schedule;
        checkCoverage();
        populateWeek();
    }

    /**
     * Generates a schedule as completely as possible with the given shifts and employees.
     */
    public void generate() {
        Employee e;
        Shift shift = new Shift();
        List<Shift> day;
        // Gives employees with 10 or less hours a week a shift.
        for(int i = 0; i < employeesByAvailableHours.size(); i++) {
            e = employeesByAvailableHours.get(i);
            if(e.getTotalHours() > 1000) {
                break;
            }
            for(int j = 0; j < 7; j++) {
                if(e.getAvailability().getDay(Day.getDay(j)).getTotalHours() > 0) {
                    shift = findShift(e, j);
                    if(shift != null) {
                        shift.setAssignedEmployee(e); //SHIFT IS NULL CAUSING NULL POINT EXCEPTION ERROR
                    }
                }
            }
        }
        updateEmployeesByHoursScheduled();
        for(int i = 0; i < weekByCoverage.size(); i++) {
            day = weekByCoverage.get(i);
            for(Shift s: day) {
                findEmployee(s, i);
                updateEmployeesByHoursScheduled();
            }
        }
        printSchedule();
        System.out.println("DONE");
    }

    /**
     * Prints the schedule for debugging purposes.
     */
    private void printSchedule() {
        System.out.println(schedule);
    }

    /**
     * Formats the schedule for the GUI to display.
     * @return
     */
    public List<String> formatSchedule() {
        return schedule.format();
    }

    /**
     * Creates the lists used to generate the schedule.
     */
    private void populateWeek() {
        sByCoverage = new ArrayList<Shift>(schedule.getDayProfile(Day.SUNDAY).getShifts());
        mByCoverage = new ArrayList<Shift>(schedule.getDayProfile(Day.MONDAY).getShifts());
        tByCoverage = new ArrayList<Shift>(schedule.getDayProfile(Day.TUESDAY).getShifts());
        wByCoverage = new ArrayList<Shift>(schedule.getDayProfile(Day.WEDNESDAY).getShifts());
        thByCoverage = new ArrayList<Shift>(schedule.getDayProfile(Day.THURSDAY).getShifts());
        fByCoverage = new ArrayList<Shift>(schedule.getDayProfile(Day.FRIDAY).getShifts());
        saByCoverage = new ArrayList<Shift>(schedule.getDayProfile(Day.SATURDAY).getShifts());
        weekByCoverage.add(sByCoverage);
        weekByCoverage.add(mByCoverage);
        weekByCoverage.add(tByCoverage);
        weekByCoverage.add(wByCoverage);
        weekByCoverage.add(thByCoverage);
        weekByCoverage.add(fByCoverage);
        weekByCoverage.add(saByCoverage);
        for(List day: weekByCoverage) {
            day.sort(new SortByCoverage());
        }
    }

    /**
     * Re-sorts the employeesByHoursScheduled list.
     */
    private void updateEmployeesByHoursScheduled() {
        employeesByHoursScheduled.sort(new SortByHoursScheduled());
    }

    /**
     * Re-sorts the employeesByAvailableHours list.
     */
    private void updateEmployeesByAvailableHours() {
        employeesByAvailableHours.sort(new SortByAvailableHours());
    }

    /**
     * Checks the coverage for each shift in the schedule.
     */
    private void checkCoverage() {
        for(List<Shift> day: weekByCoverage) {  //NEVER ENTERS THIS LOOP, WEEKBYCOVERAGE SIZE IS 0
            for(Shift s: day) {
                for(Employee e: employeesByHoursScheduled) {
                    if(e.canWork(setDayEnum(day), s)) {
                        s.incrementCoverage();
                    }
                }
            }
        }
    }

    /**
     * Sets the Day.
     * @param l
     * @return
     */
    private Day setDayEnum(List<Shift> l) {
        if(l == saByCoverage) {
            return Day.SUNDAY;
        }
        else if(l == mByCoverage) {
            return Day.MONDAY;
        }
        else if(l == tByCoverage) {
            return Day.TUESDAY;
        }
        else if(l == wByCoverage) {
            return Day.WEDNESDAY;
        }
        else if(l == thByCoverage) {
            return Day.THURSDAY;
        }
        else if(l == fByCoverage) {
            return Day.FRIDAY;
        }
        else {
            return Day.SATURDAY;
        }
    }

    /**
     * Finds an employee who is able to fill the given shift.
     * @param s
     * @param dayOfWeek
     * @return
     */
    private Employee findEmployee(Shift s, int dayOfWeek) {
        Day d = Day.getDay(dayOfWeek);
        for(Employee e: employeesByHoursScheduled) {
            if(e.canWork(d, s)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Finds a shift for the given employee.
     * @param e
     * @param dayValue
     * @return
     */
    private Shift findShift(Employee e, int dayValue) {
        List<Shift> shifts = weekByCoverage.get(dayValue);
        for(Shift s: shifts) {
            if(s.getAssignedEmployee() == null) {
                if (e.canWork(Day.getDay(dayValue), s)) {
                    return s;
                }
            }
        }
        return null;
    }

    /**
     * Checks to see if the shift is assigned.
     * @param s
     * @return
     */
    private boolean isScheduled(Shift s) {
        if(s.getAssignedEmployee().equals(null)) {
            return false;
        }
        return true;
    }
}
