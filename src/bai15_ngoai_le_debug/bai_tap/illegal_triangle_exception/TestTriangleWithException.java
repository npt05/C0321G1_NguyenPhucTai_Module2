package bai15_ngoai_le_debug.bai_tap.illegal_triangle_exception;

public class TestTriangleWithException {
    public static void main(String[] args) {
        try {
            new Triangle();
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
    }
}