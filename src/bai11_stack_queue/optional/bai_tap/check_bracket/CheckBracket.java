package bai11_stack_queue.optional.bai_tap.check_bracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public CheckBracket(String string) {
    }

    public boolean chekBracket(String exp) {
        int length = exp.length();
        Stack<String> stack = new Stack<>();
        String[] sym = exp.split("");

        for (int i = 0; i < length; i++) {
            if (sym[i].equals("(")) {
                stack.push(sym[i]);
            } else if (sym[i].equals(")")) {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return true;
        } else return false;
    }
}