package bai6.point2DPoint3D;

public class Point3D extends Point2D {
    public float z = 0.0f;

    Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(Point2D point2D, int i) {
        super(point2D.getX(), point2D.getY());
        this.z=i;
    }

    public void setXYZ(float x, float y, float z) {
        setY(y);
        setX(x);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = {getX(), getY(), z};
        return array;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
