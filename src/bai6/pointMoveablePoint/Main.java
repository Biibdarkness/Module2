package bai6.pointMoveablePoint;

import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 5);
        MoveablePoint moveablePoint = new MoveablePoint(5, 7, 3, 7);
        System.out.println(point);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
