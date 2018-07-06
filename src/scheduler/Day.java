package scheduler;

public enum Day {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private int value;

    private Day(int value) {
        value = this.value;
    }

    public int getValue() {
        return this.value;
    }

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
