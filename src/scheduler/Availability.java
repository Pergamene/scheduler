package scheduler;

import java.util.List;

public class Availability {
    List<AvailableDay> availableDays;
    int totalHours = 0;
    Date ro;

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int hours) {
        totalHours += hours; //not sure if this was the intended idea.
    }
}
