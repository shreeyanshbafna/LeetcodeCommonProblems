package Leetcode;

import java.util.Arrays;

public class SeperateZeroesandOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1 };
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			while (arr[left] == 0 && left < right) {
				left++;
			}
			while (arr[right] == 1 && left < right) {
				right--;
			}
			if (arr[left] == 1 && arr[right] == 0 && left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
