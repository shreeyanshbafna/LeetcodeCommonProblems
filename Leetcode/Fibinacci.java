package Leetcode;

import java.util.*;

public class Fibinacci {

	static HashMap<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		int n = 18;
		System.out.println(fib(n));
	}

	private static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if(map.containsKey(n)) {
			return map.get(n);
		}
		int result = fib(n-1)+fib(n-2);
		System.out.println(result);
		map.put(n, result);
		return result;

	}
}
