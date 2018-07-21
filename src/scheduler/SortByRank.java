package scheduler;

import java.util.Comparator;

/**
 * Sorts the employee priority according to the rank an employee has
 */
public class SortByRank implements Comparator<Shift> {

    @Override
    public int compare(Shift s1, Shift s2) {
        return s2.getRequiredWorkProfile().getRank().getValue() - s1.getRequiredWorkProfile().getRank().getValue();
    }

}
