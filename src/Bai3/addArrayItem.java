package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class addArrayItem {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0]= 3;
        arr[1]=5;
        arr[2]=7;
        arr[3]=2;
        arr[4]=1;
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int value = scanner.nextInt();
        System.out.print("Enter number insert: ");
        int index = scanner.nextInt();
        if(index >= 0){
            for (int i = n-1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index]=value;
            System.out.println(Arrays.toString(arr));
        } else System.out.println("can't insert");

    }
}
