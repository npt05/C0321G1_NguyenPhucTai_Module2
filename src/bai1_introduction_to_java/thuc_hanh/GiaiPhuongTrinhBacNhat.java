package bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: " );
        double a =  scanner.nextDouble();
        System.out.println("b: " );
        double b =  scanner.nextDouble();

        if(a==0){
            if(b==0){
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution!");
            }
        }else {
            double answer = ( - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }
    }
}
