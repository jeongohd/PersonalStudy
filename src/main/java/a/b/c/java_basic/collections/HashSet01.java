package a.b.c.java_basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSet01 {
	
	/*
	 * HashSet 
	 * LinkedHashSet - 저장순서 유지. 
	 */
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		System.out.println(set);
		
		List list = new LinkedList(set); // list(Collection) 매개변수로 넣어 복사 가능. 
		Collections.sort(list); // Collections.sort(List)
		System.out.println(list);
		
	}

}
