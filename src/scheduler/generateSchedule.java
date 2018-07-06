package scheduler;

import java.util.ArrayList;
import java.util.List;

public class generateSchedule {

    private List<Employee> employeesByAvailableHours;
    private List<Employee> employeesByHoursScheduled;
    private Schedule schedule;
    //    private List<List<Shift>> weekByRank;
//    private List<Shift> sByRank;
//    private List<Shift> mByRank;
//    private List<Shift> tByRank;
//    private List<Shift> wByRank;
//    private List<Shift> thByRank;
//    private List<Shift> fByRank;
//    private List<Shift> saByRank;
    private List<List<Shift>> weekByCoverage;
    private List<Shift> sByCoverage;
    private List<Shift> mByCoverage;
    private List<Shift> tByCoverage;
    private List<Shift> wByCoverage;
    private List<Shift> thByCoverage;
    private List<Shift> fByCoverage;
    private List<Shift> saByCoverage;

    public generateSchedule(List<Employee> employees, Schedule schedule) {
        this.employeesByAvailableHours = new ArrayList<Employee>(employees);
        this.employeesByHoursScheduled = new ArrayList<Employee>(employees);
        this.schedule = schedule;
        checkCoverage();
        populateWeek();
    }

    public void generate() {
        Employee e;
        Shift shift;
        List<Shift> day;
        // Gives employees with 10 or less hours a week a shift.
        for(int i = 0; i < employeesByAvailableHours.size(); i++) {
            e = employeesByAvailableHours.get(i);
            if(e.getTotalHours() > 1000) {
                break;
            }
            for(int j = 0; j < 7; j++) {
                if(e.getAvailability().getDay(Day.getDay(j)).getTotalHours() > 0) {
                    shift = findShift(e, Day.getDay(j));
                    shift.setAssignedEmployee(e);
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
    }

    private void populateWeek() {
//        sByRank = new ArrayList<Shift>(schedule.getDayProfile(Day.SUNDAY).getShifts());
//        mByRank = new ArrayList<Shift>(schedule.getDayProfile(Day.MONDAY).getShifts());
//        tByRank = new ArrayList<Shift>(schedule.getDayProfile(Day.TUESDAY).getShifts());
//        wByRank = new ArrayList<Shift>(schedule.getDayProfile(Day.WEDNESDAY).getShifts());
//        thByRank = new ArrayList<Shift>(schedule.getDayProfile(Day.THURSDAY).getShifts());
//        fByRank = new ArrayList<Shift>(schedule.getDayProfile(Day.FRIDAY).getShifts());
//        saByRank = new ArrayList<Shift>(schedule.getDayProfile(Day.SATURDAY).getShifts());
//        weekByRank.add(sByRank);
//        weekByRank.add(mByRank);
//        weekByRank.add(tByRank);
//        weekByRank.add(wByRank);
//        weekByRank.add(thByRank);
//        weekByRank.add(fByRank);
//        weekByRank.add(saByRank);
//        for(List day: weekByRank) {
//            day.sort(new SortByRank());
//        }
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

    private void updateEmployeesByHoursScheduled() {
        employeesByHoursScheduled.sort(new SortByHoursScheduled());
    }

    private void checkCoverage() {
        for(List<Shift> day: weekByCoverage) {
            for(Shift s: day) {
                for(Employee e: employeesByHoursScheduled) {
                    if(e.canWork(setDayEnum(day), s)) {
                        s.incrementCoverage();
                    }
                }
            }
        }
    }

    private Day setDayEnum(List<Shift> l) {
        if(/*l == sByRank ||*/ l == saByCoverage) {
            return Day.SUNDAY;
        }
        else if(/*l == mByRank ||*/ l == mByCoverage) {
            return Day.MONDAY;
        }
        else if(/*l == tByRank ||*/ l == tByCoverage) {
            return Day.TUESDAY;
        }
        else if(/*l == wByRank ||*/ l == wByCoverage) {
            return Day.WEDNESDAY;
        }
        else if(/*l == thByRank ||*/ l == thByCoverage) {
            return Day.THURSDAY;
        }
        else if(/*l == fByRank ||*/ l == fByCoverage) {
            return Day.FRIDAY;
        }
        else {
            return Day.SATURDAY;
        }
    }

    private Employee findEmployee(Shift s, int dayOfWeek) {
        Day d = Day.getDay(dayOfWeek);
        for(Employee e: employeesByHoursScheduled) {
            if(e.canWork(d, s)) {
                return e;
            }
        }
        return null;
    }

    private Shift findShift(Employee e, Day d) {
        List<Shift> shifts = weekByCoverage.get(d.getValue());
        for(Shift s: shifts) {
            if(e.canWork(d, s)) {
                return s;
            }
        }
        return null;
    }

    private boolean isScheduled(Shift s) {
        if(s.getAssignedEmployee().equals(null)) {
            return false;
        }
        return true;

    }
}
