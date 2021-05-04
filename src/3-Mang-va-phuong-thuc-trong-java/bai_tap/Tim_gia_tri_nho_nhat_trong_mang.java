package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int[] arr;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size =scanner.nextInt();
        arr = new int[size];
        for ( int i = 0;i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int min = arr[0];
        for (int k = 1; k < arr.length; k++) {
           if(arr[k]<min){
               min = arr[k];
           }
        }
        System.out.println();
        System.out.println("Min = " +min);
    }
}
