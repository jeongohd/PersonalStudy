package a.b.c.java_basic.usefulClass;

import java.util.Random;

public class Random01 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] num = new int[100];
		int[] counter = new int[10];
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]=rand.nextInt(10)); // Random.nextInt(int n) 0 ~ n 사이 난수.
//			=> num[i] = (int)Math.random()*10;
		}
		
		for(int i=0; i<num.length; i++) {
			counter[num[i]]++; // ★
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.println(i+"의 갯수 : " + copy('⊙', counter[i]) + counter[i]);
		}
	}
	
	public static String copy(char c, int count) {
		char[] chars = new char[count];
		for(int i=0; i<chars.length; i++) {
			chars[i] = c;
		}
		return new String(chars);
	}

}
