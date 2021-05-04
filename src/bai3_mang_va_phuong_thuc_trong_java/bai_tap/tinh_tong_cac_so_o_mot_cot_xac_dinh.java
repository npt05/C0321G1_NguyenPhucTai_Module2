package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class tinh_tong_cac_so_o_mot_cot_xac_dinh {
    public static void main(String[] args) {
        int[][] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element " + i  + " " + j  + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.print("Enter j: ");
        int indexJ = scanner.nextInt();
        int sum = 0;
        for (int k=0; k<m; k++){
            for(int l=0; l<n; l++){
               if(l==indexJ){
                   sum+=arr[k][l];
               }
                }
            }
        System.out.println("At j =  " +indexJ +  " is sum = " +sum);

        }


}
