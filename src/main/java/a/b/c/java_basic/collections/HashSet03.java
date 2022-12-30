package a.b.c.java_basic.collections;

import java.util.HashSet;

public class HashSet03 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("ojg", 10));
		set.add(new Person("ojg", 10));
		
		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name +" : " +age;
	}
	
	// equals()와 hashcode()메소드를 오버라이딩하여 중복되는 값 제거
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	
	public int hashCode() {
		return (name+age).hashCode();
	}
}