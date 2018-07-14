package scheduler;

import java.util.Comparator;

public class SortByRank implements Comparator<Shift> {

    @Override
    public int compare(Shift s1, Shift s2) {
        return s2.getRequiredWorkProfile().getRank().getValue() - s1.getRequiredWorkProfile().getRank().getValue();
    }

}
