package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] arr = {1, 21, 4, 10, 7, -3, 2};
        for (int value : arr) {
            System.out.print(value + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number delete: ");
        int number = scanner.nextInt();
        if (findX(number, arr) > 0) {
            int index_del = findX(number, arr);
            deleteX(index_del, arr);
            for (int value : arr) {
                System.out.print(value + " ");
            }
        } else {
            System.out.println("Not find " + number + " in array");
        }

    }

    static int findX(int number, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
               index = i;
               break;
            }
        }
        return index;
    }

    static int[] deleteX(int indexX, int[] array) {
        for (int i = indexX; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }
}
