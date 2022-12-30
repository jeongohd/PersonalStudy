package a.b.c.java_basic.object;

public class BindingTest {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println(p.x);
		p.method();
		System.out.println(c.x);
		c.method(); // 지역 변수는 타입에 따라서, 메소드는 생성된 인스턴스에 따라서 값이 출력. 
	}

}

class Parent {
	int x = 100;
	void method() {
		System.out.println("parent method");
	}
}

class Child extends Parent{
	int x = 200;
	void method() {
		System.out.println("child method");
	}
}