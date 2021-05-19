package bai7_abstract_class_interface.thuc_hanh.interface_comparator;

import bai7_abstract_class_interface.thuc_hanh.interface_comparator.shape.Circle;
import bai7_abstract_class_interface.thuc_hanh.interface_comparator.shape.Rectangle;
import bai7_abstract_class_interface.thuc_hanh.interface_comparator.shape.Shape;
import bai7_abstract_class_interface.thuc_hanh.interface_comparator.shape.Square;

public class ComparatorTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1.0);
        shapes[1] = new Rectangle(2.3,3.4);
        shapes[2] = new Square(5.6);

        System.out.println("Pre : ");
        for (Shape shape : shapes){
            System.out.println(shape);
        }

        System.out.println("After : ");
        for (Shape shape : shapes){
            System.out.println(shape);
            if (shape instanceof Square){
                System.out.println(((Square) shape).howToColor());
            }
        }
    }
}