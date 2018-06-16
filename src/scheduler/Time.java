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

    public String toString() {

        return "";
    }
    //toString() is in the document but I don't follow what it does.
    //it is to let us control how the string is formatted before it is viewed.
}
