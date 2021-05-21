package bai13_thuat_toan_tim_kiem.option.cai_dat_thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy;

public class NhinPhanDeQuy {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] arr, int left, int right, int value) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return binarySearch(arr, left, mid - 1, value);
            } else {
                return binarySearch(arr, mid + 1, right, value);
            }
        } else return -1;
    }

    public static void main(String[] args) {
        System.out.println( binarySearch(list,0, list.length-1,50));
        System.out.println( binarySearch(list,0, list.length-1,90));
        System.out.println( binarySearch(list,0, list.length-1,10));
    }
}
