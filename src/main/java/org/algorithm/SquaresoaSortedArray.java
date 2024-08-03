package org.algorithm;

import java.util.Arrays;

public class SquaresoaSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] sq = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sq[i] = nums[i]+1 * nums[i]+1;
        }
        Arrays.sort(sq);
        return sq;
    }

    public static void main(String[] args) {
        int[] num = {-4, -1, 0, 3, 10};
        SquaresoaSortedArray.sortedSquares(num);
        System.out.println(num);
    }
}


