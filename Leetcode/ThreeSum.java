package Leetcode;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 3, 5, 7, 9, 2,0,0,0,0,0,0,0,0, 4, 6, 8, 8 ,0,0,0,0,0,0};
		int insertPos =0;
		for (int num : nums) {
            if (num != 0) {
				nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
        System.out.println(Arrays.toString(nums));
	}

}
