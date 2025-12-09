package gr.aueb.cf.cf9.ch11;

public class Point {
    private final int x; //making them immutable
    private final int y;

    public Point() {
        x = 0; //we need to initialize them if theyre immutable
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    //public void setX(int x) { cannot have setters on immutable objects
    //    this.x = x;
    //}

    public int getY() {
        return y;
    }

    //public void setY(int y) {
    //    this.y = y;
    //}
}
