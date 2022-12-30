package a.b.c.java_basic.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet04 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet(); // addAll
		HashSet setKyo = new HashSet(); // retainAll
		HashSet setCha = new HashSet(); // removeAll
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(setA.contains(obj)) {
				setKyo.add(obj);
			}
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(!setB.contains(obj)) {
				setCha.add(obj);
			}
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		
		System.out.println(setKyo);
		System.out.println(setCha);
		System.out.println(setHab);
	}

}
