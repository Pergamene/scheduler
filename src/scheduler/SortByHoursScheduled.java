package scheduler;

import java.util.Comparator;

/**
 * Sorts the employee priority according to the hours an employee is already scheduled
 */
public class SortByHoursScheduled implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getHoursScheduled() - e2.getHoursScheduled();
    }

}
