package bai5_access_modifier_static_method_static_property.bai_tap;

public class Access_modifier {
    public static class Circle {
        private double radius = 1.0;
        private String color = "red";

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return this.radius;
        }

        public double getArea() {
            return (Math.pow(this.radius, 2) * Math.PI);
        }
    }

    static class A {
        int data = 40;
        private void msg(){
            System.out.println("Hello java");
        }
    }

    public static class Simple{
        public static void main(String[] args) {
            A obj = new A();
            System.out.println(obj.data);
        }
    }

    public static class TestCircle {
        public static void main(String[] args) {
            Circle circle = new Circle(10);
            System.out.println("Area : " + circle.getArea() + " Radius: " + circle.getRadius());
        }
    }

}
