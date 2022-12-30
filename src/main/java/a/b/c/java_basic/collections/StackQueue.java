package a.b.c.java_basic.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); // LinkedList는 Queue인터페이스를 구현한 것. 
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("---Stack---");
		while(!st.isEmpty()) {
			System.out.println(st.pop()); // pop 스택의 맨 위에 객체 반환.
		}
		
		System.out.println("---Queue---");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // poll 큐에서 꺼내옴. 
		}
	}

}
