package bai13_thuat_toan_tim_kiem.option.chuoi_lien_tiep_max;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiLienTiepMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> listMax = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(list);
            }
        }

        for (Character character : listMax) {
            System.out.print(character);
        }
        System.out.println();
    }
}
