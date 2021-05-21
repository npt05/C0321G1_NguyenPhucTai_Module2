package bai14_thuat_toan_sap_xep.bai_tap.illustration_insertion_sort;

import java.util.Arrays;

public class InsertionSortByStep {
    static int[] list = {1, 5, 9, 6, 7, -4};
    public static void insertionSort(int[] list){
        int pos, x;

        for(int i = 1; i < list.length; i++){
            System.out.println("Chọn phần tử vị trí " + i +" là "+ list[i]);
            x = list[i];
            pos = i;
            System.out.println("So sánh phần tử đã chọn với các phần tử vị trí 0 đến " +pos);
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }

            System.out.println("Chèn phần tử đã chọn vào vị trí 0 đến " +pos);
            list[pos] = x;
            System.out.println("Mảng sau lần chọn thứ "+i+" "+Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
