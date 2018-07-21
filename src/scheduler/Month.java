package scheduler;

/**
 * Enum of month with corresponding numbers for each (Ex: JANUARY = 1).
 */
public enum Month {
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10),
    NOVEMBER(11), DECEMBER(12);

    private int value;

    private Month(int value) {
        value = this.value;
    }

    public int getValue() {
        return this.value;
    }
}
