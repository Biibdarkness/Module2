package bai2;

import java.util.Scanner;

public class PrimeNumber20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        boolean isPrime = true;
        while (count <= number) {
            isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.printf("%d \n", n);
                count++;
            }
            n++;
        }
    }
}
