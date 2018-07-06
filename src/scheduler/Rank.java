package scheduler;

public enum Rank {
    TEAM_MEMBER, TEAM_LEADER, SUPERVISOR, SHIFT_MANAGER;

    /*public static Rank fromString(String text) {
        for (Rank r : Rank.values()) {
            if (r.toString().equalsIgnoreCase(text)) {
                return r;
            }
        }
        return null;
    }*/
}
