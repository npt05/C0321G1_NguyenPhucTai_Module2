package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Dem_so_lan_ki_tu_xuat_hien_trong_chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "Counts the number of occurrences of a string";
        System.out.println(str);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int i = FindAndCount(str,character);
        System.out.println(i);
    }
    public static int FindAndCount(String string,char character){
        int count = 0;
        for (int i = 0; i < string.length();i++){
            if (string.charAt(i)==character){
                count++;
            }
        }
        return count;
    }
}
