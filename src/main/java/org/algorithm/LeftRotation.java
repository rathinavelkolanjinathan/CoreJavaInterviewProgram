package org.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
	static int[] rotLeft(int[] a, int d) {
		int n = a.length;
		int[] rotArray = new int[n];

		for (int oldIndex = 0; oldIndex < n; oldIndex++) {
			int newIndex = (oldIndex + n - d) % n;
			rotArray[newIndex] = a[oldIndex];
		}

		return rotArray;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int input = sc.nextInt();
		int[] defaultSize = new int[arraySize];
		for (int i = 0; i < defaultSize.length; i++) {
			defaultSize[i] = sc.nextInt();
		}

		int res[] = rotLeft(defaultSize, input);
		System.out.println("LeftRotation"+Arrays.toString(res));
		sc.close();
	}
}
