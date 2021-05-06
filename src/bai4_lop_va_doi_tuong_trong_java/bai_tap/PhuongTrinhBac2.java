package bai4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static class Quadratic {
        private double a;
        private double b;
        private double c;
        private double delta;

        public Quadratic(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant() {
            this.delta = (this.b * this.b - 4 * this.a * this.c);
            return this.delta;
        }

        public double getRoot1() {
            return (-this.b + Math.pow(this.delta, 0.5)) / (2 * this.a);
        }

        public double getRoot2() {
            return (-this.b - Math.pow(this.delta, 0.5)) / (2 * this.a);
        }
    }


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Solve the quadratic equation");
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        Quadratic quadratic = new Quadratic(a, b, c);
        double delta = quadratic.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two roots: ");
            System.out.println("root 1: " + quadratic.getRoot1());
            System.out.println("root 2: " + quadratic.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root: " + quadratic.getRoot1());
        } else {
            System.out.println("The equation has no real roots!");
        }

    }
}
