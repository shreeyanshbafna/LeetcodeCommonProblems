package Leetcode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arra = { 1, 3, 3, 5, 7, 9, 2, 4, 6, 8, 8 };
		int sum = 9;
		Arrays.sort(arra);
		int left = 0;
		int right = arra.length - 1;
		while (left < right) {
			if (arra[left] == arra[left + 1]) {
				left++;
			}
			if (arra[right] == arra[right - 1]) {
				right--;
			}
			if (arra[left] + arra[right] == sum) {
				System.out.println(arra[left] + "," + arra[right]);
				left++;
				right--;
			}
			if (arra[left] + arra[right] < sum) {
				left++;
			}
			if (arra[left] + arra[right] > sum) {
				right--;
			}
		}
	}

}
