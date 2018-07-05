package scheduler;

import java.util.Comparator;

public class SortByAvailableHours implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getAvailability().getTotalHours() - e2.getAvailability().getTotalHours();
    }
}
