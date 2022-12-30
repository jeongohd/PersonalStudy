package a.b.c.java_basic.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator01 {
	
	/*
	 * Comparator 와 Comparable은 모두 인터페이스로 객체들을 정렬하는데 필요한 메소드를 정의. 
	 * Comparable을 구현한 클래스는 정렬이 가능하다.
	 * 
	 * Comparable - 기본 정렬기준을 구현하는데 사용.
	 * Comparator - 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용. 
	 */
	
	public static void main(String[] args) {
		TreeSet set1 = new TreeSet();
		TreeSet set2 = new TreeSet(new Descending());
		
		int[] score = {30,50,10,20,40};
		for(int i=0; i<score.length; i++) {
			set1.add(score[i]);
			set2.add(score[i]);
		}
		System.out.println(set1);
		System.out.println(set2);
	}
}

class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1; 
			Comparable c2 = (Comparable)o2; 
			return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경. ==> c2.compareTo(c1)
		}
		return -1;
	}
}
