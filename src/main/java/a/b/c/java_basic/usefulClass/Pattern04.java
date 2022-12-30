package a.b.c.java_basic.usefulClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern04 {

	public static void main(String[] args) {
		String source = "A broken hand works, but not a broken heart.";
		String pattern = "broken";
		StringBuffer sb = new StringBuffer();
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		System.out.println(source);
		int i=0;
		while(m.find()) {
			System.out.printf("%s번째 매칭 : %s ~ %s\n",++i, m.start(), m.end());
			m.appendReplacement(sb, "drunken"); 
			// 1. A broken -> A drunken
			// 2. A broken hand works, but not a broken
			// -> A drunken hand works, but not a drunken
		}
		System.out.println(sb.toString());
		
		m.appendTail(sb); // 마지막 부분까지 sb에 추가.
		System.out.println(sb.toString());
		
		
	}
	
}
