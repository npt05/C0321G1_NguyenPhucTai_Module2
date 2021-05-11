package bai6_ke_thua.bai_tap.lop_circle_cylinder;


public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(4,5);
        System.out.println(cylinder);
    }
}
