package scheduler;

import java.util.Comparator;

/**
 * Sorts the employee priority according to available coverage an employee can commit to
 */
public class SortByCoverage implements Comparator<Shift> {
    @Override
    public int compare(Shift s1, Shift s2) {
        return s1.getCoverage() - s2.getCoverage();
    }
}
