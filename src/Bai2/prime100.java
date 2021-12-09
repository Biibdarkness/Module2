package Bai2;

import java.util.Scanner;

public class prime100 {
    public static void main(String[] args) {
        int number = 100;
        int c = 0;
        int n = 2;
        boolean isPrime = true;

        while (c <= number) {
            isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d \n", n);
                c++;
            }
            if (n < 100) {
                n++;
            } else {
                break;
            }
        }
    }
}
