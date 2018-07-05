package scheduler;

public enum Rank {
    TEAM_MEMBER(0), TEAM_LEADER(1), SUPERVISOR(2), SHIFT_MANAGER(3);

    private int value;

    private Rank(int value) {
        value = this.value;
    }

    public int getValue() {
        return this.value;
    }
}
