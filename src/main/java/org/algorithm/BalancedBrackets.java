package org.algorithm;

import java.util.Stack;

/**
 *
 */
public class BalancedBrackets {
    /**
     * @param str
     * @return
     */
    private static String matchParenthes(String str) {
        Stack<Character> stack = new Stack<Character>();
        char[] ch = str.toCharArray();

        for (char c : ch) {

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {

                if (c == ']' && !stack.isEmpty() && stack.pop() == '[') {
                    continue;

                } else if (c == '}' && !stack.isEmpty() && stack.pop() == '{') {
                    continue;
                } else if (c == ')' && !stack.isEmpty() && stack.pop() == '(') {
                    continue;
                } else {
                    return "NO";
                }

            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }

        return "YES";

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int t = in.nextInt();
        // for (int a0 = 0; a0 < t; a0++) {
        // String s = in.next();
        System.out.println("Balanced brackets::" + matchParenthes("{}){}"));
        // }
        // in.close();
    }
}
