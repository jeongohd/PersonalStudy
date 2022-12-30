package a.b.c.java_basic.collections;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// subList로 객체 복사. 
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // index 1 ~ 3;
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		list2.add("B"); 
		list2.add("C"); // 4, 2, 0, B, C
		list2.add(3, "A"); // 4, 2, 0, A, B, C
		print(list1, list2);
		
		// list1 은 list2와 겹치는 부분만 남김. 
		System.out.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
		print(list1, list2);
		
		// ★ list2의 사이즈가 변할 것이기에 감소시켜 반복.
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1,list2);
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1 );
		System.out.println("list2 : " + list2 );
		System.out.println();
	}

}
