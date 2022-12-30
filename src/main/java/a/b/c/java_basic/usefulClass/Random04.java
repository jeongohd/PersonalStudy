package a.b.c.java_basic.usefulClass;

import java.util.HashMap;
import java.util.Iterator;

public class Random04 {
	
	
	public static void main(String[] args) {
		
		String[] data = {"A","A","B","C"};
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0; i<100; i++) {
			String tmp = getRandArr(data);
			if(map.containsKey(tmp)) {
				int val = map.get(tmp);
				map.put(tmp, val+1);
			} else {
				map.put(tmp, 1);
			}
		}
		
		Iterator it = map.keySet().iterator(); // keySet() 키(Key)만. 
		while(it.hasNext()) {
			String key = (String)it.next(); 
			int value = map.get(key);
			System.out.printf("%s : %s %s\n", key ,copy('#',value), value);
		}
		
		
	}
	
	public static String copy(char ch, int n) {
		char[] chars = new char[n];
		for(int i=0; i<chars.length; i++) {
			chars[i] = ch;
		}
		return new String(chars);
	}
	
	public static String getRandArr(String[] strs) {
		return strs[getRand(strs.length-1)];
	}
	
	
	public static int getRand(int num) {
		return getRand(0,num);
	}
	public static int getRand(int from, int to) {
		return (int)(Math.random()*(Math.abs(to-from)+1)) 
				+ Math.min(from, to);
	}

}
