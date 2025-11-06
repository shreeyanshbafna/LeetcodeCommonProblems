package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetsBacktracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 5, 6, 0, 9, 8 };

		List<List<Integer>> tracker = new ArrayList<List<Integer>>();
		generatesub(arr, 0, new ArrayList<Integer>(), tracker);
		Collections.sort(tracker, (a, b) -> Integer.compare(a.size(), b.size()));
		System.out.println(tracker);
	}

	public static void generatesub(int[] arr, int index, List<Integer> current, List<List<Integer>> tracker) {
		if (index == arr.length) {
			tracker.add(new ArrayList<Integer>(current));
			return;
		}
		current.add(arr[index]);
		generatesub(arr, index + 1, current, tracker);

		current.remove(current.size() - 1);
		generatesub(arr, index + 1, current, tracker);

		// TODO Auto-generated method stub

	}
}
