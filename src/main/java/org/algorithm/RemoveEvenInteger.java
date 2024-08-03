package org.algorithm;

import java.util.Arrays;

public class RemoveEvenInteger {
    public static void main(String[] args) {
        int[] evenArray = {2, 3, 4, 5, 6};
        int result[] = removeEvenNumber(evenArray);
        printArray(result);
    }

    public static int[] removeEvenNumber(int evenArray[]) {
        int oddcount = 0;
        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] % 2 != 0) {
                oddcount++;
            }
        }
        int[] result = new int[oddcount];  //based on the event number we are creating the array
        int idx = 0;
        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] % 2 != 0) {
                result[idx] = evenArray[i];
                idx++;
            }
        }
        return result;
    }

    public static void printArray(int[] result) {
        Arrays.stream(result).forEach(t -> System.out.println(t));

    }
}
