package bai5_access_modifier_static_method_static_property.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area : " + circle.getArea() + " Radius: " + circle.getRadius());
    }
}
