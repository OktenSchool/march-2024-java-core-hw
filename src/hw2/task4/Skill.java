package src.hw2.task4;

public class Skill {
    private String title;
    private int experience;

    public Skill() {
    }

    public Skill(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "title='" + title + '\'' +
                ", experience=" + experience +
                '}';
    }
}
