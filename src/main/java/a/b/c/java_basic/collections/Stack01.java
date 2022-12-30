package a.b.c.java_basic.collections;

import java.util.Stack;

public class Stack01 {
	
	/*
	 * ★ 뒤로가기 / 앞으로가기
	 */
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) forward.clear();
	}
	
	public static void goForward() {
		if(!forward.empty()) back.push(forward.pop()); 
	}
	
	public static void goBack() {
		if(!back.empty()) forward.push(back.pop());
	}
	
	public static void print() {
		System.out.println("back : "+ back);
		System.out.println("forward : "+ forward);
		System.out.println("Current Page is " + back.peek());
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		goURL("1. nate");
		goURL("2. yahoo");
		goURL("3. naver");
		goURL("4. daum");
		print();
		
		goBack();
		print();
		
		goBack();
		print();
		
		goForward();
		print();
		
		goURL("5. new page");
		print();
		
		
	}
	

	

}
