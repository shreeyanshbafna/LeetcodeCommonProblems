package Leetcode;

import java.util.Arrays;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String s1 = "abcdeerewe";
		String s2 = "ghjabc";
		int m = s1.length();
		int n = s2.length();
		int maxlenth = 0;
		int[][] dp = new int[m + 1][n + 1];
		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
					maxlenth = Math.max(maxlenth, dp[i][j]);
				} else {
					dp[i][j] = 0;
				}
			}
		}
		for (int[] u : dp) {
			System.out.println(Arrays.toString(u));
		}
		System.out.println(maxlenth);
	}

}
