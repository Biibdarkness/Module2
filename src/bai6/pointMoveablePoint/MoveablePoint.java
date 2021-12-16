package bai6.pointMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    MoveablePoint() {

    }

    MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        setY(y);
        setX(x);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void move() {
        float x = getX();
        float y = getY();
        x += xSpeed;
        y += ySpeed;

    }
}
