package a.b.c.java_basic.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator01 {
	
	/*
	  	Iterator - 컬렉션에 저장된 각 요소에 접근. 
	  	iterator()는 Collection 인터페이스에 정의된 메소드이므로 List와 Set에 포함되어 있음.
	  
	 	List list = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Map map = new HashMap();
		Iterator it2 = map.keySet().iterator();  keySet() - Map의 key만을 가지고 List 만듦.
		Iterator list2 = map.entrySet().iterator(); entrySet - Map의 (key, value)를 가지고 List 만듦.
	  
	 */

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");

		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		ListIterator lit = list.listIterator();
		
		
		System.out.println("ListIterator 순방향");
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println("ListIterator 역방향 - 순방향으로 갔을 경우 실행가능.");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		

	}

}
