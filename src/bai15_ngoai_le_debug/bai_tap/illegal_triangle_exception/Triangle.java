package bai15_ngoai_le_debug.bai_tap.illegal_triangle_exception;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("cạnh tam giác phải khác 0  ");
        } else if ((a + b <= c) || (a + c) <= b || (b + c) <= a) {
            throw new IllegalTriangleException("trong 1 tam giác tổng 2 cạnh luôn lớn hơn 1 cạnh");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle:" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c
                ;
    }
}