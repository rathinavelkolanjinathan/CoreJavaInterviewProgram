package org.algorithm;

public class MinimumValuesInArray {

    public static void main(String[] args) {
        int[] minimumArray = {5, 9, 3, 15, 1, 2};
        int result = getMinimumValueArray(minimumArray);
        System.out.print("final values " + result);
    }

    public static int getMinimumValueArray(int[] minimumArray) {

        if (minimumArray == null || minimumArray.length == 0) {

            throw new IllegalArgumentException("Exception");
        }

        int min = minimumArray[0];

        for (int i = 0; i < minimumArray.length; i++) {
            if (minimumArray[i] < min) {   // this is find the miminumn logic
                min = minimumArray[i]; // when is minimu values is occured then only come inside
                //System.out.print("loop"+min);
            }
        }
        return min;
    }
}
