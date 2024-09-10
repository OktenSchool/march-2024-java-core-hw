package hw2.task2;

public class WorkStation extends Laptop{
    private String videoCard;

    public WorkStation(){

    }

    public WorkStation(int CPUs, int RAM, double monitor, int weight, String videoCard) {
        super(CPUs, RAM, monitor, weight);
        this.videoCard = videoCard;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "WorkStation{" +
                "videoCard='" + videoCard + '\'' +
                "} " + super.toString();
    }
}
