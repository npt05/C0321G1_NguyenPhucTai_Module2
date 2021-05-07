package bai4_lop_va_doi_tuong_trong_java.bai_tap.ptbac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Solve the quadratic equation");
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        PTBac2 ptBac2 = new PTBac2(a, b, c);
        System.out.println(ptBac2.getResult());
    }
}
