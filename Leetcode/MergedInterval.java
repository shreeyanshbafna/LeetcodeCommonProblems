package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedInterval {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, { 2, 3 }, { 6, 7 }, { 2, 3 }, { 9, 8 } };
		for (int[] interval : arr) {
            if (interval[0] > interval[1]) {
                int temp = interval[0];
                interval[0] = interval[1];
                interval[1] = temp;
            }
        }    //if needed
		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

		List<int[]> merged = new ArrayList<int[]>();
		for (int[] c : arr) {
			if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < c[0]) {
				
				merged.add(c);
				/*
				 * for (int[] i : merged) { System.out.println(Arrays.toString(i)); }
				 * System.out.println("if");
				 */
			} else {
				merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], c[1]);
				/*
				 * for (int[] i : merged) { System.out.println(Arrays.toString(i)); }
				 * System.out.println("else");
				 */
			}
		}
		for (int[] i : merged) {
			System.out.println(Arrays.toString(i));
		}
		int y = merged.get(merged.size() - 1)[1] ;
		System.out.println(y);
	}
}
