package scheduler;

/**
 * Stores a start and end time as integer values in military time (Ex: 3PM = 15).
 */
public class Time {
    //private String startTime;
    //private String endTime;
    private int startTime;
    private int endTime;

    /**
     * The default constructor sets start and end times to 0
     */
    public Time() {
        this.startTime = 0;
        this.endTime = 0;
    }

    /**
     * The non-default constructor sets the times according to received integers.
     * @param startTime
     * @param endTime
     */
    public Time(Integer startTime, Integer endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Returns the startTime
     * @return
     */
    public int getStartTime() {
        return startTime;
    }

    /**
     * Sets the startTime.
     * @param startTime
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * Returns the endTime.
     * @return
     */
    public int getEndTime() {
        return endTime;
    }

    /**
     * Sets the endTime.
     * @param endTime
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * Returns the total hours by subtracting the endTime from the startTime
     * @return
     */
    public int getTotalHours() {
        return endTime - startTime;
    }

    /*
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
    }*/
}
