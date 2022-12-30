package a.b.c.java_basic.collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Queue01 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; 

	public static void main(String[] args) {
		
		System.out.println("input help to display help.");
		
		while(true) {
			System.out.println(">>");
			try {
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine().trim();
				
				if("".equals(input)) continue;
				if(input.equalsIgnoreCase("q")) { // 타입 상관없이 비교.
					System.exit(0); // main 메서드를 종료시킴. 
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - display help");
					System.out.println("q or Q - finish this program");
					System.out.println("history - command you've inputted will be shown up to " + MAX_SIZE);
				} else if (input.equalsIgnoreCase("history")) {
					int i=0;
					save(input);
					LinkedList temp = (LinkedList)q;
					ListIterator it = temp.listIterator();
					while(it.hasNext()) {
						System.out.println(++i+ "."+it.next());
					}
				} else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("error for input");
			}
		}
	}
	
	public static void save(String input) {
		if(!"".equals(input)) q.offer(input); // q에 input을 저장. 
		if(((LinkedList)q).size() > MAX_SIZE) q.remove(); // Queue.remove() 가장 앞에 있는 객체를 지워주는 듯.  
	}

}
