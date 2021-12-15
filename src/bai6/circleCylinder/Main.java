package bai6.circleCylinder;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập bán kính: ");
        double r = scanner.nextDouble();
        circle.setRadius(r);
        circle.setColor("red");
        cylinder.setColor("green");
        cylinder.setRadius(r);
        cylinder.setHeight(r);
        System.out.println(circle.getS());
        System.out.println(cylinder.getV());
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}
