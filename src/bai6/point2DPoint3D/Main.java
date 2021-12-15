package bai6.point2DPoint3D;


public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 5);
        Point3D point3D = new Point3D(4, 3, 5);
        Point3D pointtest = new Point3D(point2D,5);
        System.out.println(point2D);
        System.out.println(point3D);
        System.out.println(pointtest);


    }
}
