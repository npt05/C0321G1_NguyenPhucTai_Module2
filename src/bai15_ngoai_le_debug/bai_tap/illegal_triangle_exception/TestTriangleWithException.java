package bai15_ngoai_le_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TestTriangleWithException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            try {
                System.out.println("Nhập lần lượt 3 cạnh tam giác ");
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                int c = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(a, b, c);
                System.out.println("triangle = " + triangle);
                flag = false;

            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                System.out.println(" Mời nhập lại ");
                flag = true;

            } catch (NumberFormatException e) {
                System.err.println("Bạn nhập không phải là số");
                System.out.println(" Mời nhập lại ");
                flag = true;

            } catch (Exception e) {
                System.err.println("xảy ra ngoại lệ :");
                System.out.println(" Mời nhập lại");
                flag = true;
            }
        } while (flag);
    }
}