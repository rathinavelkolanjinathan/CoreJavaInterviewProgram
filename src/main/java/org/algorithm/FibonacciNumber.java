package org.algorithm;

public class FibonacciNumber {
	/**
	 * This method is used to generate the nth fibonacci number
	 * 
	 * @param n
	 * @return a nth fibonacci number
	 */
	public static int fibonacci(int n) {
		//System.out.println("input values: "+n);
		if (n == 0 || n == 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);

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
		System.out.println("fibonacci::"+fibonacci(10));
	}
}
