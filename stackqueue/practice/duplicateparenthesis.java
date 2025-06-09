package stackqueue.practice;

import java.util.*;

public class duplicateparenthesis {
    public static boolean hasDuplicate(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (ch == ')') {
                int count = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                if (count <= 0) {
                    return true; // Duplicate found
                }

                stack.pop(); // pop the opening '('
            } else {
                stack.push(ch);
            }
        }

        return false; // No duplicates found
    }
    //recursive
    public static boolean hasDuplicate(String expr) {
        return check(expr, 0, new Stack<>());
    }

    private static boolean check(String expr, int index, Stack<Character> stack) {
        if (index == expr.length()) return false;

        char ch = expr.charAt(index);

        if (ch != ')') {
            stack.push(ch);
        } else {
            int count = 0;
            while (!stack.isEmpty() && stack.peek() != '(') {
                stack.pop();
                count++;
            }
            if (count <= 0) return true; // duplicate
            if (!stack.isEmpty()) stack.pop(); // pop the '('
        }

        return check(expr, index + 1, stack);
    }

    public static void main(String[] args) {
        String s1 = "(a+b)";
        String s2 = "((a+b))";
        String s3 = "(a + ((b)))";

        System.out.println(hasDuplicate(s1)); // false
        System.out.println(hasDuplicate(s2)); // true
        System.out.println(hasDuplicate(s3)); // true
    }
}
