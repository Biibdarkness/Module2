package bai6.circleCylinder;

public class Cylinder extends Circle {
    private double height;

    public double getV(){
        return super.getS()*height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "radius" + getRadius() +
                "color" + getColor()+
                '}';
    }
}
