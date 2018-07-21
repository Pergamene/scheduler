package scheduler;

import java.util.Objects;

/**
 * Contains Enums Area and Rank
 */
public class WorkProfile {
    private Rank rank;
    private Area area;

    /**
     * Default constructor
     */
    public WorkProfile() {

    }

    /**
     * Non-default constructor that sets the workProfile values based on a received Rank and Area.
     * @param rank
     * @param area
     */
    public WorkProfile(Rank rank, Area area) {
        this.rank = rank;
        this.area = area;
    }

    /**
     * Non-default constructor that sets the workProfile values based on a received String(rank) and String(area).
     * @param rank
     * @param area
     */
    public WorkProfile(String rank, String area) {
        this.rank = Rank.valueOf(rank);
        this.area = Area.valueOf(area);
    }

    /**
     * Returns the rank.
     * @return
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Sets the rank
     * @param rank
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    /**
     * Returns the Area
     * @return
     */
    public Area getArea() {
        return area;
    }

    /**
     * Sets the Area
     * @param area
     */
    public void setArea(Area area) {
        this.area = area;
    }

    /**
     * Sets the Area and Rank with String values received.
     * @param area
     * @param rank
     */
    public void setWorkProfile(String area, String rank) {
        this.rank = Rank.valueOf(rank);
        this.area = Area.valueOf(area);
    }

    /**
     * Checks to see if p is the right area with at least the right rank.
     * @param p
     * @return
     */
    public boolean meetsRequirement(WorkProfile p) {
        if(p.getRank().equals(Rank.SHIFT_MANAGER))
            return true;
        if(this.area.equals(p.getArea())) {
            if(this.rank.getValue() <= p.getRank().getValue()) {
                return true;
            }
        }
        return false;
    }
}
