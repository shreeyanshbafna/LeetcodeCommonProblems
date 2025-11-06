package Leetcode;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String l1 = "silent";
		String l2 = "listen";
		int[] c = new int[26];

		for (char c1 : l1.toCharArray()) {
			c[c1 - 'a']++;
		}
		for (char c1 : l2.toCharArray()) {
			c[c1 - 'a']--;
		}
		Boolean t = true;
		for (int i : c)
			if (i != 0) {
				t = false;
				break;
			}
		System.out.println(t);
	}

}
