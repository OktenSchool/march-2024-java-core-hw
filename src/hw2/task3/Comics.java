package src.hw2.task3;

public class Comics extends Book{
    private String author;

    public Comics(){

    }

    public Comics(int size, int pages, String author) {
        super(size, pages);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "author='" + author + '\'' +
                "} " + super.toString();
    }
}
