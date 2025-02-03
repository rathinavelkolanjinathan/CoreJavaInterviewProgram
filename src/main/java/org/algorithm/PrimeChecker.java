package org.algorithm;

import java.util.stream.IntStream;

public class PrimeChecker {
    public static boolean isPrime(int number) {

        return IntStream.rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        boolean checkPrime = PrimeChecker.isPrime(7);
        System.out.println("Prime number{}:" + checkPrime);
    }

}
