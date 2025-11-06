package Leetcode;

public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "2A3C4B";

char[] ch = str.toCharArray();
StringBuilder sb = new StringBuilder();
String num = "";

for(int i=0; i<ch.length; i++) {
	
if(Character.isDigit(ch[i] )) {
	num =num+String.valueOf(ch[i]);
}	else {
	sb.append(String.valueOf(ch[i]).repeat(Integer.parseInt(num)));
	num ="";
}
}
String encode =sb.toString();
System.out.println(encode);

	}

}
