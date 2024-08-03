package org.arrayprogram;

public class FindingMissingNumber {
	
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15 };
		int arrayLength = array.length;
		//System.out.println("array length " + arrayLength);
		int ideal = (arrayLength * (arrayLength + 1) / 2);
		System.out.println("ideal::" + ideal);
		int sum = 0; // Arrays.stream(missingNum).sum();
		for (int i = 0; i < arrayLength - 1; i++) {
			sum += array[i];
		}
		System.out.println("Array sum::" + sum);
		int missingNumber = ideal - sum;
		System.out.println("missingNumber::" + missingNumber);
	}
}
