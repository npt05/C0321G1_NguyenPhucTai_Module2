package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Mang2ChieuTongDuongCheoChinh {
    public static void main(String[] args) {
        int[][] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        if(m==n){
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

            int sum = 0;
            for (int k=0; k<m; k++){
                for(int l=0; l<n; l++){
                    if(l==k){
                        sum+=arr[k][l];
                    }
                }
            }
            System.out.println(" Sum diagonal line = " +sum);
        }else {
            System.out.println("Arr is not matrix square!");
        }

    }

}
