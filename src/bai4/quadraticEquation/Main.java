package bai4.quadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextInt();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextInt();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextInt();
        QuadraticEquation quadraticEquationClass = new QuadraticEquation();
        quadraticEquationClass.setCoefficientA(a);
        quadraticEquationClass.setCoefficientB(b);
        quadraticEquationClass.setCoefficientC(c);
        double delta = (b * b) - (4 * a * c);
        quadraticEquationClass.setDiscriminant(delta);
        System.out.println("Delta is: " + quadraticEquationClass.getDiscriminant());
        if (delta >= 0) {
            double r1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            quadraticEquationClass.setRoot1(r1);
            quadraticEquationClass.setRoot2(r2);
            System.out.println("The system of equations with first solution is " + quadraticEquationClass.getRoot1());
            System.out.println("The system of equations with the second solution is " + quadraticEquationClass.getRoot2());
        }
        if(delta < 0) {
            System.out.println("The system of equations with no solution");
        }
    }
}
