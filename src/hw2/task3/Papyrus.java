package src.hw2.task3;

public class Papyrus {
    private int size;

    public Papyrus() {
    }

    public Papyrus(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "size=" + size +
                '}';
    }
}
