package bai15_ngoai_le_debug.thuc_hanh.use_array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[]arr = new Integer[100];
        System.out.println("danh sach phan tu cua mang : ");
        for (int i = 0 ; i < 100; i ++){
            arr[i] = rd.nextInt(100 );
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n bui long nhap chi so cua mot phan tu bat ky ");
        int x = scanner.nextInt();
        try {
            System.out.println("gia tri cua phan tu chi co so 5 la : " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("chi so vuot qua gioi han cua mang");
        }
    }
}