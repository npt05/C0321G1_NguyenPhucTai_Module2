package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    int length = scanner.nextInt();
                    System.out.print("Enter width: ");
                    int width = scanner.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.print("Enter edge length: ");
                    int edge = scanner.nextInt();
                    System.out.println("Print the square triangle(botton-left)");
                    for (int i = 0; i < edge; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("Print the square triangle(top-left)");
                    for (int i = 4; i >= 0; i--) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.print("Enter heigth is an odd number: ");
                    int heigth = scanner.nextInt();
                    if (heigth % 2 == 0) {
                        System.out.println("Can't draw the scale.");
                    } else {
                        for (int i = 0; i < heigth; i++) {
                            for (int j = 0; j < (2 * heigth - 1); j++) {
                                if (j >= heigth - 1 - i && j <= heigth - 1 + i) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println(" ");
                        }
                    }
                    break;
                case 4:
                    System.exit(4);
            }
        }
    }
}
