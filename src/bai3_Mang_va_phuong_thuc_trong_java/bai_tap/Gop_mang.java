package bai3_Mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size array1: ");
        int size1 = scanner.nextInt();

        array1 = new int[size1];
        for ( int i = 0;i < array1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Array1: ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        System.out.println();

        System.out.print("Enter a size array2: ");
        int size2 = scanner.nextInt();

        array2 = new int[size2];
        for ( int k = 0;k < array2.length; k++) {
            System.out.print("Enter element " + (k + 1) + ": ");
            array2[k] = scanner.nextInt();
        }

        System.out.print("Array2: ");
        for (int l = 0; l < array2.length; l++) {
            System.out.print(array2[l] + "\t");
        }

        System.out.println();

        int[] array3 = new int[(size1+size2)];
        System.out.print("Array3: ");
        for (int j = 0; j < array1.length; j++) {
            array3[j] = array1[j];
            System.out.print(array3[j] + "\t");
        }
        for (int l = 0; l < array2.length; l++) {
            array3[(size1-1)+1+l]=array2[l];
            System.out.print(array3[(size1-1)+1+l] + "\t");
        }

    }

}
