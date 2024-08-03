package org.arrayprogram;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOnArray {
    public static void main(String[] args) {
        int originalArray[] = {10, 4, 2, 5, 9, 8, 7};
        //getReverse(originalArray);
        getReverseJdk8(originalArray);
    }

    //old method
    public static void getReverse(int[] reverse) {
        for (int i = 0; i < reverse.length / 2; i++) {
            int other = reverse.length - i - 1;
            int temp = reverse[i];
            reverse[i] = reverse[other];
            reverse[other] = temp;

        }
        for (int a : reverse) {
            System.out.println(a);
        }

    }
    //using jdk8
    public static void getReverseJdk8(int[] originalArray) {
        int[] reversedArray = Arrays.stream(originalArray)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        // Print the reversed array
        System.out.print("Reversed Array jdk8 : ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }



}
