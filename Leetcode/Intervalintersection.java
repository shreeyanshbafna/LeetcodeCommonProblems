package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intervalintersection {
	public static void main(String[] args) {
		int[][] A = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
		int[][] B = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
		List<int[]> res = new ArrayList<>();
		int i = 0, j = 0;
		while (i < A.length && j < B.length) {
			int start = Math.max(A[i][0], B[j][0]);
			int end = Math.min(A[i][1], B[j][1]);
			if (start <= end) {
				res.add(new int[] { start, end });
			}
			if (A[i][1] < B[j][1]) {
				i++;
			} else {
				j++;
			}
		}
		for (int[] y : res) {
			System.out.println(Arrays.toString(y));
		}
	}
}
