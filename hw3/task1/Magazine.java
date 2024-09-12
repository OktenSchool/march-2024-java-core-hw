package hw3.task1;

public class Magazine implements Printable{
    private String title;

    public Magazine() {
    }

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Magazine Title: " + this.title);
    }
}
