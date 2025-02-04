package org.algorithm;

public class Factorial {
    public static void main(String[] args) {
        int nn = 5;
        int result = factorial(nn);

        System.out.println("Factorials of " + nn+"= " + result);
    }

    static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }
    }
}
