package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        int newValue;
        int [] arr = {1,3,5,7,4,0,0,0,0};

        for (int value: arr){
            System.out.print(value + "\t");
        }

        System.out.println();

        System.out.print("Enter index position to insert: ");
        index = scanner.nextInt();
        System.out.print("Enter new value :");
        newValue = scanner.nextInt();

        addElement(newValue,index,arr);
        for (int value: arr){
            System.out.print(value + "\t");
        }
    }

    public static int[] addElement(int value, int index,int[]array){
        for (int i = array.length - 1; i >= index;i--){
            array[i] = array [i - 1];
        }
        array[index] = value;
        return array;
    }
}
