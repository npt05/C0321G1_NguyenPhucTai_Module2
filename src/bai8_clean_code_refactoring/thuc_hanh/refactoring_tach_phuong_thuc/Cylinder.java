package bai8_clean_code_refactoring.thuc_hanh.refactoring_tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius, 2, Math.PI);
        double volume = perimeter*height + 2*baseArea;
        return volume;
    }

    protected static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    protected static double getPerimeter(int radius, double i, double pi) {
        return i * pi * radius;
    }


}