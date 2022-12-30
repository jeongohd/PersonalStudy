package a.b.c.java_basic;

public class InnerClass {
	
	class InstanceInner {
		int iv = 100;
//		static int cv = 100;  static 클래스가 아니므로 static변수 선언 불가. 
		final static int CONST = 100; // final static 은 상수이므로 허용. 
	}
	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static클래스만 static멤버 정의 가능. 
	}
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300; error;
			final static int CONST = 300;
		}
	}
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
