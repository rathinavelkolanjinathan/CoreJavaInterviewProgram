package org.algorithm;

public class StringUniqueCharacter_Model1 {

    public static void main(String[] args) {

        String uniqueueVal = "Hellohhhh";
        boolean b = StringUniqueCharacter_Model1.uniqueueChar(uniqueueVal);
        System.out.println("boolean " + b);
    }

    public static boolean uniqueueChar(String uniqueueVal) {

        if (uniqueueVal.length() > 128) {

            return false;
        }

        boolean[] char_Set = new boolean[128];
        for (int i = 0; i < uniqueueVal.length(); i++) {

            int val = uniqueueVal.charAt(i);
            System.out.println("values " + val);
            if (char_Set[val]) {

                return false;
            } else {

                return true;
            }

        }

        return true;
    }
}
