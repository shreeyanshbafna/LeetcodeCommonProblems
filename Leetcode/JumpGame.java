package Leetcode;

public class JumpGame {
	public static void main(String[] args) {
		int y[] = { 3, 2, 1, 0, 4 };
		boolean res = jumpossible(y);
		System.out.println(res);
	}

	static boolean jumpossible(int y[]) {
		int reachable = 0;
		for (int i = 0; i < y.length; i++) {
			if (i > reachable) {
				System.out.println(i);
				return false;
			}
			reachable = Math.max(reachable, i + y[i]);
		}
		return true;

	}
}
