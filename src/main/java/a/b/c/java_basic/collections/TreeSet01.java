package a.b.c.java_basic.collections;

import java.util.TreeSet;

public class TreeSet01 {
	
	// TreeSet - 저장할 때 정렬함.
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("flower");
		
		System.out.println(set);
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from, to+"zzz")); // d까지 포함하기 위해. 
	}

}
