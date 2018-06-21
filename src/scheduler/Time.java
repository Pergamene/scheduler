package scheduler;

public class Time {
    private String startTime;
    private String endTime;

    public Time(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTimeInt() {
        return timeToInt(startTime);
    }

    public String getStartTime() {
        return startTime;
    }

    public int getEndTimeInt() {
        return timeToInt(endTime);
    }

    public String getEndTime() {
        return endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getTotalHours() {
        return Math.abs(timeToInt(endTime) - timeToInt(startTime));
    }

    //HH:MM PM/AM-HH:MM PM/AM
    public String toString() {
        return startTime + "-" + endTime;
    }

    private int timeToInt(String time) {
        boolean isTwelve = (time.charAt(0) == '1' && time.charAt(1) == '2');
        int timeInt = 0;
        timeInt += Integer.parseInt(String.valueOf(time.charAt(0))) * 1000;
        timeInt += Integer.parseInt(String.valueOf(time.charAt(1))) * 100;
        timeInt += Integer.parseInt(String.valueOf(time.charAt(3))) * 10;
        timeInt += Integer.parseInt(String.valueOf(time.charAt(4))) * 1;
        if(time.charAt(6) == 'P' && !isTwelve) {
            timeInt += 1200;
        }
        if(time.charAt(6) == 'A' && isTwelve) {
            timeInt -= 1200;
        }
        return timeInt;
    }
}
