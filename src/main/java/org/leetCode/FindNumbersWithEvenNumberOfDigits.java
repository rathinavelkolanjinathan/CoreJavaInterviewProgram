package org.leetCode;

/**
 * Working fine
 */

public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) ||
                    (nums[i]>99999 && nums[i]<1000000)||
                    (nums[i]>9999999 && nums[i]<100000000)||nums[i]>100000000){
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896};
       // int largest = Arrays.stream(nums).filter((i) -> i % 2 == 0).max().getAsInt();
        //System.out.print(largest);
        //int[]  num = {555,901,482,1771};
      int result=  FindNumbersWithEvenNumberOfDigits.findNumbers(num);
        System.out.print(result);
    }
}
