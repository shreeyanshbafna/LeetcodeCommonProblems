package Leetcode;

import java.util.Arrays;
import java.util.Iterator;

public class LongestCommonSequence {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "ghjabcrdfghdhe";
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m + 1][n + 1];
		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		for (int[] u : dp) {
			System.out.println(Arrays.toString(u));
		}

		System.out.println(dp[m][n]);

	}

}
