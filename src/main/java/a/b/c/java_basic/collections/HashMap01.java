package a.b.c.java_basic.collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap01 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("abc", "1234");
		map.put("efg", "1111");
		map.put("efg", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("input id");
			String id = s.nextLine().trim();
			System.out.println("input password");
			String password = s.nextLine().trim();
			if(!map.containsKey(id)) {
				System.out.println("not user. try to input again."); continue;
			} else {
				if(!map.get(id).equals(password)) {
					System.out.println("wrong password");
				} else {
					System.out.println("hi, "+id);
					break;
				}
			}
		}
	}

}
