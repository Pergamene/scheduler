package scheduler;

import java.util.Comparator;

public class SortByCoverage implements Comparator<Shift> {
    @Override
    public int compare(Shift s1, Shift s2) {
        return s1.getCoverage() - s2.getCoverage();
    }
}
