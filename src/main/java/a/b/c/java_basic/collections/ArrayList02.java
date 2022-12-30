package a.b.c.java_basic.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList02 {
	
	/*
	 * ArrayList 순차적으로 추가/삭제할 경우, 접근이 빠름
	 * LinkedList 중간 데이터를 추가/삭제할 경우, 접근이 느림
	 * 
	 * 두 클래스를 혼합해서 사용. 
	 * ArrayList a1 = new ArrayList(10000000);
	 * for(int i=0; i<100000; i++) a1.add(i+"");
	 * LinkedList l1 = new LinkedList(a1);
	 * for(int i=0; i<1000; i++) l1.add(500,"X"); why?? (500번 부터 X대입..)
	 */

	public static void main(String[] args) {
		
		// 불변하는 변수는 상수로 두는 연습을 하자. 
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		System.out.println("length : "+length);
		
		List list = new ArrayList(length/LIMIT + 10); // 크기를 약간 여유있게 잡음.
		
		for(int i=0; i<length; i+=LIMIT) {
			if(i+LIMIT < length) {
				list.add(source.substring(i, i+LIMIT));
			} else {
				list.add(source.substring(i));
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
