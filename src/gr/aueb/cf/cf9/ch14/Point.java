package gr.aueb.cf.cf9.ch14;

public class Point {
    private double x;

    //cannot be inherited
    public Point() {}

    //cannot be inherited
    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void movePlusOne() {
        x += 1;
    }

    //cannot be inherited
    protected void movePlusTen() {
        x += 10;
    }

    //cannot be inherited
    private void reset() {
        x = 0;
    }

    @Override
    public String toString() {
        return"(" + x + ")";
    }
}
