package a.b.c.java_basic.object;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s = new Singleton();  생성자가 private로 설정되어 있으므로 오류
		Singleton s1 = Singleton.getInstance();
	}

}

final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		// ...
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s=new Singleton();
		}
		return s;
	}
}