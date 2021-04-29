package bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class tinh_chi_so_can_nang_co_the {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, weight, bmi;
        System.out.println("Your weight  (in kilogram): ");
        weight = scanner.nextDouble();
        System.out.println("Your height  (in meter): ");
        height = scanner.nextDouble();
        bmi = weight / (height * height);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18) {
            System.out.println("%-20s%s " + bmi + " Underweight");
        } else if (bmi < 25.0) {
            System.out.println("%-20s%s " + bmi + " Normal");
        } else if (bmi < 30.0) {
            System.out.println("%-20s%s " + bmi + " Overweight");
        } else {
            System.out.println("%-20s%s " + bmi + " Obese");
        }
    }

}
