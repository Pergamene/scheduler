package scheduler;

import java.util.ArrayList;
import java.util.List;

public class RequestTimeOff {

    Employee e;
    Date dateRequested;
    List<Date> dates;

    public RequestTimeOff(Employee e, Date dateRequested, List<Date> dates) {
        this.e = e;
        this.dateRequested = dateRequested;
        this.dates = dates;
    }

    public RequestTimeOff(Employee e, Date dateRequested, Date date) {
        this.e = e;
        this.dateRequested = dateRequested;
        this.dates = new ArrayList<Date>();
        this.dates.add(date);
    }

    public Employee getEmployee() {
        return e;
    }

    public Date getDateRequested() {
        return dateRequested;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void modifyDates(List<Date> dates) {
        this.dates = dates;
    }

    public void modifyDates(Date dates) {
        this.dates = new ArrayList<Date>();
        this.dates.add(dates);
    }
}
