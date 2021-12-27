package bai11.reverseElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PraStack {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Stack<String> list = new Stack<String>();
//        System.out.println("Nhập chuỗi: ");
//        String s = scanner.nextLine();
//        for (int i = 0; i < s.length(); i++) {
//            list.push(s.charAt(i)+"");
//        }
//        System.out.println("Chuỗi đảo ngược: ");
//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(list.pop());
//        }
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> list = new Stack<Integer>();
//        System.out.println("Nhập chuỗi: ");
//        String s = scanner.nextLine();
        int arr [] = new int[]{5,5,7,2,4,6,8};
        for (int i = 0; i < arr.length; i++) {
           list.push(arr[i]);
        }
        System.out.println("Chuỗi đảo ngược: ");
        for (int i = 0; i < arr.length; i++) {
          arr[i]=list.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
