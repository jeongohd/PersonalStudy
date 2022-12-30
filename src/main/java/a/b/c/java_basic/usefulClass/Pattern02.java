package a.b.c.java_basic.usefulClass;

import java.util.regex.Pattern;

public class Pattern02 {

	public static void main(String[] args) {
		String[] data = {"bat", "Baby", "bonus", "ca", "Co", "date", "disc"};
		Pattern p = Pattern.compile("b[a-z]*"); // b로 시작하는 소문자영단어
		for(int i=0; i<data.length; i++) {
			if(p.matcher(data[i]).matches()) {
				System.out.println(data[i]);
			}
		}
	}
	
}
