package a.b.c.java_basic.usefulClass;

import java.util.regex.Pattern;

public class Pattern01 {

	public static void main(String[] args) {
		String str = "f3sfds6";
		String pat = "[0-9]";
		char[] chars = str.toCharArray();
		int count = 0;
		for(char i : chars) {
			if(Pattern.matches(pat, i+"")) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Count : "+count);
	}
	
}
