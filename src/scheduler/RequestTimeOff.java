package scheduler;

import java.util.ArrayList;
import java.util.List;

/**
 * Takes an employee, a date and a list of dates to request a specific day off for an employee.
 */
public class RequestTimeOff {

    Employee e;
    Date dateRequested;
    List<Date> dates;

    /**
     * Sets multiple dates to request off.
     * @param e
     * @param dateRequested
     * @param dates
     */
    public RequestTimeOff(Employee e, Date dateRequested, List<Date> dates) {
        this.e = e;
        this.dateRequested = dateRequested;
        this.dates = dates;
    }

    /**
     * Sets one date to request off.
     * @param e
     * @param dateRequested
     * @param date
     */
    public RequestTimeOff(Employee e, Date dateRequested, Date date) {
        this.e = e;
        this.dateRequested = dateRequested;
        this.dates = new ArrayList<Date>();
        this.dates.add(date);
    }

    /**
     * Returns the employee
     * @return
     */
    public Employee getEmployee() {
        return e;
    }

    /**
     * Returns the dateRequested (off)
     * @return
     */
    public Date getDateRequested() {
        return dateRequested;
    }

    /**
     * Returns the list of dates
     * @return
     */
    public List<Date> getDates() {
        return dates;
    }

    /**
     * Changes the days requested off with the ones sent.
     * @param dates
     */
    public void modifyDates(List<Date> dates) {
        this.dates = dates;
    }

    /**
     * Changes the days requested off with the one sent.
     * @param dates
     */
    public void modifyDates(Date dates) {
        this.dates = new ArrayList<Date>();
        this.dates.add(dates);
    }
}
