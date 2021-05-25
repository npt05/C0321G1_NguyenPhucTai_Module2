package bai15_ngoai_le_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 >= side2 + side3)
            throw new IllegalTriangleException(side1);
        else if (side2 >= side1 + side3)
            throw new IllegalTriangleException(side2);
        else if (side3 >= side2 + side1)
            throw new IllegalTriangleException(side3);
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public Triangle() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter side1: ");
        double side1 = scanner.nextDouble();
        System.out.println("enter side2: ");
        double side2 = scanner.nextDouble();
        System.out.println("enter side3: ");
        double side3 = scanner.nextDouble();
        if (side1 >= side2 + side3)
            throw new IllegalTriangleException(side1);
        else if (side2 >= side1 + side3)
            throw new IllegalTriangleException(side2);
        else if (side3 >= side2 + side1)
            throw new IllegalTriangleException(side3);
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
                + " Side 3 = " + side3;
    }
}