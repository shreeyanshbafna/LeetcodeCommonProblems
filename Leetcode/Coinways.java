package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Coinways {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5 };
		int target = 8;
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		generateways(arr, target, 0, new ArrayList<Integer>(), result);
		System.out.println(result);
	}

	public static void generateways(int[] arr, int target, int index, ArrayList<Integer> current,
			ArrayList<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<Integer>(current));

			return;
		}
		if (target < 0 || index >= arr.length)
			return;
		
		
		current.add(arr[index]);
		generateways(arr, target - arr[index], index, current, result);   //if coin repeatation is allowes
		//generateways(arr, target - arr[index], index+1, current, result);   //if coin repeatation is not allowes

		current.remove(current.size() -1);
		generateways(arr, target, index + 1, current, result);

	}

}
