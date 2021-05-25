package bai15_ngoai_le_debug.bai_tap.illegal_triangle_exception;

class IllegalTriangleException extends Exception {

    private double side = 1.0;

    public IllegalTriangleException(double side) {
        super(side + " is larger than other two combined");
    }

    public double getSide1() {
        return side;
    }
}
