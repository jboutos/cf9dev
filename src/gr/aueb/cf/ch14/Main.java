package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(15.8);
        //Point2D p2 = new Point2D(2, 5.5);
        Point p2 = new Point2D(2, 5.5);
        //Point3D p3 = new Point3D(2, 5.5, 10);
        Point p3 = new Point3D(2, 5.5, 10);

        p1.movePlusOne();
        p2.movePlusTen();
        p3.movePlusOne();

        doMovePlusTen(p1);
        doMovePlusTen(p2);
        doMovePlusTen(p3);

        //System.out.println(p1); //calls toString of Point
        //System.out.println(p2);
        //System.out.println(p3);

        doPrint(p1);
        doPrint(p2);
        doPrint(p3);
    }

    public static void doMovePlusTen(Point p) {
        p.movePlusTen(); //depending on the point the appropriate point is called // polymorphism // late binding
    }

    public static void doPrint(Point p) {
        System.out.println(p);
    }
}
