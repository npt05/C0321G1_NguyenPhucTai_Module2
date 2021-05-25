package bai15_ngoai_le_debug.bai_tap.illegal_triangle_exception;

public class TriangleWithException {
    private double perimeter;
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    private static int numberOfObjects = 0;

    public TriangleWithException(double side1, double side2, double side3){
    }

    public TriangleWithException(double newPerimeter){
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double newPerimeter) throws IllegalArgumentException {
        if (newPerimeter >= 0){
            perimeter = newPerimeter;
        } else
            throw new IllegalArgumentException("Any two sides needs to be grater than the other side");
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double findArea(){
        double p = getPerimeter();
        return Math.sqrt(p * ((p - side1) * (p - side2 ) * (p - side3)));
    }
}
