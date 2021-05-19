package bai7_abstract_class_interface.thuc_hanh.interface_comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(1.1);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(2.0,"red",false);

        System.out.println("Pre-sorted");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
