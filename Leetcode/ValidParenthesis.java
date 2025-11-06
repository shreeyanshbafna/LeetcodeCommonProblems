package Leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String s1 = "{}()ss{{{{";
		Stack<String> st = new Stack<>();
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		Stack<Character> sta = new Stack<Character>();
		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				sta.push(s1.charAt(i));
			} else if (map.containsValue(s1.charAt(i))) {
				if (sta.isEmpty()) {
					System.out.println("not valid i");
					return;
				}
				sta.pop();
			}

		}
		if (sta.isEmpty() == false) {
			System.out.println("not valid");
		}
	}

}
