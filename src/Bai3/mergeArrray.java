package Bai3;

import java.util.Arrays;

public class mergeArrray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5}; //Mảng khởi tạo 1
        int[] arr2 = {6,7,8,9,10}; //Mảng khởi tạo 2
        int length = arr1.length + arr2.length; //Thêm độ dài của Mảng 1 vào Mảng 2
        int[] arr3 = new int[length]; //Mảng kết quả
        int i = 0;
        for (int element : arr1) //Sao chép các phần tử của Mảng 2 bằng vòng lặp for-each
        {
            arr3[i] = element;
            i++; //Tăng vị trí lên 1
        }
//        System.out.println(arr3[]);
        for (int element : arr2) //sao chép các phần tử của Mảng 1 bằng vòng lặp for-each
        {
            arr3[i] = element;
            i++;
        }
        System.out.println(Arrays.toString(arr3)); //In mảng kết quả
    }
}

