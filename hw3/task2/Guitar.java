package hw3.task2;

public class Guitar implements Instrument{
    private int countOfStrings;

    public Guitar() {
    }

    public Guitar(int countOfStrings) {
        this.countOfStrings = countOfStrings;
    }

    public int getCountOfStrings() {
        return countOfStrings;
    }

    public void setCountOfStrings(int countOfStrings) {
        this.countOfStrings = countOfStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "countOfStrings=" + countOfStrings +
                '}';
    }

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " "+this.countOfStrings + " strings");
    }
}
