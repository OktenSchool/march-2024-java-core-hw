package hw2.task3;

public class Magazine extends Book{
    private double thickness;

    public Magazine(){

    }

    public Magazine(int size, int pages, double thickness) {
        super(size, pages);
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "thickness=" + thickness +
                "} " + super.toString();
    }
}
