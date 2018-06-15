package scheduler;

public class Time {
    int startTime = 0;
    int endTime = 0;

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getTotalHours() {
        return (endTime - startTime);
    }

    //toString() is in the document but I don't follow what it does.
}
