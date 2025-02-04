package org.algorithm;

public class Fibonacci {
    /**
     * This method is used to generate the nth fibonacci number
     *
     * @param n
     * @return a nth fibonacci number
     */
    public static int fib(int n) {
        //System.out.println("input values: "+n);
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    /**
     * Unit tests the {@code FibonacciNumber}
     *
     * @param args
     */
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //scanner.close();
        System.out.println("fibonacci::" + fib(5));
    }
}
