package gr.aueb.cf.ch14;

public class Point2D extends Point {
    private double y;

    public Point2D() {
        super(); //initialization of Point // not necessary
        y = 0; //not necessary
    }

    public Point2D(double x, double y) {
        super(x); // this form calls the overloaded constructor of Point
        //setX(x); // this is a setter of Point // if Point had private constructors then we couldnt have Point2D
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    protected void movePlusTen() {
        super.movePlusTen();
        y += 10;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + y + ")";
    }
}
