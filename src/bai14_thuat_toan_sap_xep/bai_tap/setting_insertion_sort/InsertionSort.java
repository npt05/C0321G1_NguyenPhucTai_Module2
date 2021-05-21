package bai14_thuat_toan_sap_xep.bai_tap.setting_insertion_sort;

public class InsertionSort {
    private static int[] arr = {5, 7, 9, 3, 4, 1, 8};

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
    
    public static void main(String[] args) {    
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
