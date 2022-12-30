package a.b.c.java_basic.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap02 {
	
	/*
	 *	entrySet() 메서드는 key와 value의 값 모두 출력
	 *	keySet() 메서드는 key의 값만 출력
	 */

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("kim", 80);
		map.put("lee", 100);
		map.put("oh", 95);
		map.put("ji", 95);
		
		Set set = map.entrySet(); // Map.entrySet() 을 이용해서 키,값을 함께 읽어 올 수 있음. 
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey() +" , "+ e.getValue());
		}
		
		set = map.keySet(); // 키
		System.out.println(set); 
		
		Collection values = map.values(); // 값
		it = values.iterator();
		int total = 0;
		while(it.hasNext()) {
			int i = (int)it.next();
			total+=i;
		}
		System.out.println("total : "+total);
		System.out.println("avg : "+(float)total/set.size());
		System.out.println("max : "+ Collections.max(values));
	}
	

}
