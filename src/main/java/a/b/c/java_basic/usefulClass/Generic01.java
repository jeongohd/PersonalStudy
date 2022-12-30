package a.b.c.java_basic.usefulClass;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic01 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("a", 1, 1));
		list.add(new Student("z", 1, 2));
		list.add(new Student("u", 2, 1));
		list.add(new Student("d", 2, 2));

		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name);
		}
	}

}

class Student {
	String name = "";
	int ban, no;
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}
