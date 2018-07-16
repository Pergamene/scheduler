package scheduler;

public class WorkProfile {
    private Rank rank;
    private Area area;

    public WorkProfile() {

    }

    public WorkProfile(Rank rank, Area area) {
        this.rank = rank;
        this.area = area;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

}
