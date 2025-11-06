package javaforgood;

import java.util.stream.Collectors;

public class pallindrom1withalphanumeric {
	public static void main(String[] args) {
		String s = "anagna--";
		int left = 0;
		int right = s.length() - 1;
		Boolean h = true;
		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if(left < right && Character.toLowerCase(s.charAt(right) )!=  Character.toLowerCase(s.charAt(left)) ) {
				System.out.println("false");
				h =false;
				break;
				
			}
			left++;
			right--;
		}
		System.out.println(h);
		
	}
	public boolean isPalindrome(String s) {
        String s1 = s.chars()
                     .filter(Character::isLetterOrDigit)
                     .mapToObj(x -> Character.toLowerCase((char) x))
                     .map(String::valueOf)
                     .collect(Collectors.joining());

        String reversed = new StringBuilder(s1).reverse().toString();
        return s1.equals(reversed);
    }
}
