package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(duplicate(nums));
	}

	private static List<Integer> duplicate(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] < 0) {
				result.add(index + 1);
			} else {
				nums[index] = -nums[index];
			}
			System.out.println(Arrays.toString(nums));
		}
		return result;
	}

}
