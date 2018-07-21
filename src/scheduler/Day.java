package scheduler;

/**
 * Enum of day of week and their correlating numbers (Ex: SUNDAY = 0)
 */
public enum Day {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private int value;

    private Day(int value) {
        value = this.value;
    }

    /**
     * Returns day value
     * @return
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Returns the day based on a number provided
     * @param value
     * @return
     */
    public static Day getDay(int value) {
        switch(value) {
            case 0:
                return SUNDAY;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            default:
                return SATURDAY;
        }
    }
}
