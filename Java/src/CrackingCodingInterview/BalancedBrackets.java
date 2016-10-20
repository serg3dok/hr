package CrackingCodingInterview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * { [ ( ) ] }
 * i
 *
 */


public class BalancedBrackets {
    public static boolean isBalanced(String expression) {


        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{' ) {
                stack.push(expression.charAt(i));
            }
            else if (expression.charAt(i) == ')') {

                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
            else if (expression.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
            else if (expression.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
            else return false;
        }
        if (!stack.isEmpty()) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
