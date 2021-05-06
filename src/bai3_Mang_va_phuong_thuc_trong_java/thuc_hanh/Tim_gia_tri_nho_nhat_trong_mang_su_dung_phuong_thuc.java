package bai3_Mang_va_phuong_thuc_trong_java.thuc_hanh;

public class Tim_gia_tri_nho_nhat_trong_mang_su_dung_phuong_thuc {

    public static void main(String[] args) {
        int[] arr = {4,12,7,8,1,6,9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is " +arr[index]);
    }
    static int minValue(int[] array){
        int index =0;
        for(int i=0; i<array.length; i++){
            if(array[i]<array[index]){
                index =i;
            }
        }
        return index;
    }
}
