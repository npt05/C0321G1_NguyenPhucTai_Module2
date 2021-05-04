package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class Chuong_trinh_chuyen_doi_nhiet_do {
    static double celsiusToFahrenheit(double clesius) {
        double fahrenheit = (9.0 / 5) * clesius + 32;
        return fahrenheit;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        double clesius = (5.0 / 9) * (fahrenheit - 32);
        return clesius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double clesius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsisu: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    clesius = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsisu: " + celsiusToFahrenheit(clesius));
                    break;
                case 0:
                    System.exit(0);
            }

        } while (choice != 0);
    }
}
