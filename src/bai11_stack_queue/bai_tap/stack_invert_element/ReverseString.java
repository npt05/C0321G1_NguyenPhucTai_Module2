package bai11_stack_queue.bai_tap.stack_invert_element;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String :");

        String string = scanner.nextLine();
        StringBuilder outString = new StringBuilder();

        String[] strArr = string.split(" ");
        Stack<String> stack = new Stack<>();
        for (String element : strArr)
            stack.push(element);

        while (!stack.isEmpty())
            outString.append(stack.pop()).append(" ");
        System.out.println(outString);
    }
}