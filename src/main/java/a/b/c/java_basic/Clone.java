package a.b.c.java_basic;

public class Clone {

	public static void main(String[] args) {
		Point3 original = new Point3(3,5);
		Point3 copy = (Point3)original.clone();
		System.out.println(original);
		System.out.println(copy);
	}
}

class Point3 implements Cloneable { // Cloneable 인터페이스 구현한 클래스에서만 clone()메소드를 호출 가능.  
	int x, y;
	Point3(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "x = "+x+", y= "+y;
	}
	public Object clone() { // CloneNotSupportedException 이 선언되어 있어, try-catch문 사용해야 함.
		Object obj = null;
		try {
			obj = super.clone();
		} catch (Exception e) {}
		return obj;
	}
}