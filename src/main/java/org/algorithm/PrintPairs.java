package org.algorithm;

public class PrintPairs {

    //o(n2)
    public static void main(String[] args) {
        //(n-1)+(n-2)+(n-3)+...2+1    n(n-1)/2
        int arr[]={2,3,4,5,7,8};
        printPairs(arr);
    }

    static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.println(array[i] + " " + array[j]);
            }
        }

    }
}
