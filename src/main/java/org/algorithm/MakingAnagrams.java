package org.algorithm;

import java.util.HashMap;

public class MakingAnagrams {
    public static void isAnagram(String firstString, String secondString) {

//Remove all white space & case differences
        String strCopyOne = firstString.replaceAll("\\s", "").toUpperCase();
        String strCopyTwo = secondString.replaceAll("\\s", "").toUpperCase();
        //If the strings aren’t the same length, not anagrams
        if (strCopyOne.length() != strCopyTwo.length()) {
            System.out.println(firstString + " and " + secondString + " are not anagrams.");
            return;
        }
        //HashMap to store the number of characters
        HashMap mapOne = createMapKeys(strCopyOne);
        HashMap mapTwo = createMapKeys(strCopyTwo);
        if (mapOne.equals(mapTwo)) {
            System.out.println(firstString + " and " + secondString + " are anagrams");
        } else {
            System.out.println(firstString + " and " + secondString + " are not anagrams.");
        }
    }
    public static HashMap createMapKeys(String str) {
        HashMap map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int count = (int) map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            } else {
                map.put(str.charAt(i), 0);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // String a = in.next();
        // String b = in.next();
        isAnagram("nowww", "own");
        //System.out.println();
        // in.close();
    }
}
