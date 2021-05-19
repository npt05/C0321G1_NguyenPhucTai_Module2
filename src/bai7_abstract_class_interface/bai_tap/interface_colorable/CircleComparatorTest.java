package bai7_abstract_class_interface.bai_tap.interface_colorable;

import javafx.scene.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1);
        circles[1] = new Circle(2);
        circles[2] = new Circle(3);

        System.out.println("Pre-sorted: ");

        for (Circle circle : circles){
            System.out.println(circle);
        }

        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After-sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }

    }
}