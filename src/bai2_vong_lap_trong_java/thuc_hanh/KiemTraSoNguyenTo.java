package bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  number:");
        int number = scanner.nextInt();
        boolean flag = true;
        if (number < 2) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(number + " is a prime.");
        }else {
            System.out.println(number + " is not a prime.");
        }
    }
}
