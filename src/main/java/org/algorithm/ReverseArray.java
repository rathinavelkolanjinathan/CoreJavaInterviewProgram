package org.algorithm;

import java.util.Arrays;
import java.util.logging.Logger;

public class ReverseArray {
    private static final Logger logger = Logger.getLogger(ReverseArray.class.toString());
    public static void main(String[] args) {

        int reverseArr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        ReverseArray.reverseArray(reverseArr, 0, reverseArr.length - 1);
        Arrays.stream(reverseArr)
                .forEach(values -> logger.info("Reverse array"+values));
    }

    public static void reverseArray(int arr[], int start, int end) {
       // System.out.println("Start Values::" + start + "End Values ::" + end);
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }
}
