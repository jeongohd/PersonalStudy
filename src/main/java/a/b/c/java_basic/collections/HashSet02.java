package a.b.c.java_basic.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet02 {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		int[][] bingo = new int[5][5];
		
		for(int i=0; set.size()<25; i++) {
			String num = (int)(Math.random()*50)+1+"";
			set.add(num);
		}
		System.out.println(set);
		
		Iterator it = set.iterator();
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				bingo[i][j] = Integer.parseInt((String)it.next()); // object -> String -> Integer
				System.out.print((bingo[i][j] < 10 ? "  " : " ")+bingo[i][j]);
			}
			System.out.println();
		}
		
	}

}
