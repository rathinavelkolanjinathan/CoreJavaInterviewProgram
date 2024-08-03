package org.stringprogram;

public class StringPermutation {
    public static void main(String args[]) {
        String input = "abb";

        /* * A method exposed to client to calculate permutation of String in Java. */
        permutation(input, "");

    }

    private static void permutation(String str, String space) {
        if (str.length() == 0) {
            System.out.println("permutations values => " + str + space);
			//System.err.println("permutations values => " + str + space);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, space + str.charAt(i));
            }
        }
    }

}