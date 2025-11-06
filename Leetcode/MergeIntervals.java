package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, { 2, 3 }, { 6, 7 }, { 2, 4 }, { 2, 3 }, { 9, 8 } };

		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

		List<int[]> merged = new ArrayList<int[]>();

		for (int[] interval : arr) {

			if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
				merged.add(interval);
			} else {

				merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
			}

		}
		for (int[] x : merged) {
			System.out.println(Arrays.toString(x));
		}

		String op = "hiiui";
		String msg = switch (op) {
		case "hiii", "ji" -> "true";
		default -> throw new IllegalArgumentException("Unexpected value: ");
		};
		System.out.println(msg);
	}
}
