package org.algorithm;

import java.util.Arrays;

public class StringPermutation {
    public static void main(String[] args) {
        String val1 = "Hello";
        String val2 = "olleH";
        boolean b = StringPermutation.permutation(val1, val2);
        System.out.println("results ::" + b);
    }

    public static boolean permutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return sort(s1).equals(sort(s1));
    }

    public static String sort(String s) {

        char[] content = s.toCharArray();

        //System.out.println("To char" + content);

        Arrays.sort(content);

        return new String(content);
    }

}
