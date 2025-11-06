package Leetcode;

import java.util.Arrays;

public class MeetingRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 0, 30 }, { 35, 410 }, { 615, 720 } ,{45,500}};
	boolean h =	canpersonattend(intervals);
	System.out.println(h);
	}

	private static boolean canpersonattend(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		for (int i = 1; i < intervals.length - 1; i++) {
			if (intervals[i][0] < intervals[i - 1][1]) {
				System.out.println("no");
				return false;
			}
		}
		return true;

	}

}
