package org.algorithm;

import java.util.stream.IntStream;

import static java.lang.Math.sqrt;

/**
 * time complexity  o(n)
 */
public class PrimeChecker {
    public static boolean isPrime(int n) {
    //prime number 2,3,5,7,11....97
        for (int i = 2; i < sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean checkPrime = PrimeChecker.isPrime(10);
        System.out.println("Prime number{}:" + checkPrime);
    }

}
