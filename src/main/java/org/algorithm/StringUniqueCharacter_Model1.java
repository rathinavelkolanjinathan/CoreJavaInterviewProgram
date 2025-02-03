package org.algorithm;

public class StringUniqueCharacter_Model1 {

    public static void main(String[] args) {
        String uniqueVal = "Hellohhhh";
        boolean b = StringUniqueCharacter_Model1.uniqueChar(uniqueVal);
        System.out.println("boolean " + b);
    }

    public static boolean uniqueChar(String uniqueVal) {
        if (uniqueVal.length() > 128) {
            return false;
        }
        boolean[] char_Set = new boolean[128];
        for (int i = 0; i < uniqueVal.length(); i++) {
            int val = uniqueVal.charAt(i);
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
