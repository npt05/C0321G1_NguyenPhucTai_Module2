package bai6_ke_thua.bai_tap.Point_va_MovablePoint;

public class TestPointAndMovablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(1.0f, 2.0f);
        System.out.println(point);

        System.out.println("Test MovablePoint:");
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        System.out.println("Before move: ");

        movablePoint = new MovablePoint(3.0f, 4.0f, 5.0f, 6.0f);
        System.out.println(movablePoint);

        movablePoint.move();

        System.out.println("After move: ");
        System.out.println(movablePoint);


    }
}
