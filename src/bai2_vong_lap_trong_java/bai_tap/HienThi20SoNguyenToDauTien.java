package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng số nguyên tố cần in ra: ");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            int dem = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    dem++;
                }
            }
            if (dem == 0) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
