package Leetcode;

public class Decode {
	public static void main(String[] args) {
		String h = "aaaacccbbb";
		StringBuilder sb = new StringBuilder();
		int i = 0;
		char[] z = h.toCharArray();
		int count = 1;
		while (i < z.length - 1) {
			if (z[i] == z[i + 1]) {
				count++;
			} else {
				sb.append(count);
				sb.append(String.valueOf(z[i]));
				count = 1;
			}
			i++;
		}
		sb.append(count).append(h.charAt(h.length() - 1));

		System.out.println(sb.toString());
	}
}
