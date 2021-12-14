package bai2;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* \t");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* \t");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 10; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* \t");
                        }
                        System.out.println("");
                    }
                    for (int i = 10; i >=1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* \t");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
