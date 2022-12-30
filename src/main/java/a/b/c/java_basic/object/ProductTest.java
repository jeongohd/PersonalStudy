package a.b.c.java_basic.object;

class product1 {
	static int count = 0;
	int serialNo;
	{ // Constructor 인스턴스가 생성될 때마다 count값을 1씩 증가시켜 serialNo에 저장.  
		++count;
		serialNo = count;
	}
	public product1(){} // 기본 생성자(생략가능)
}

public class ProductTest {
	public static void main(String[] args) {
		product1 p1 = new product1();
		product1 p2 = new product1();
		product1 p3 = new product1();
		System.out.println("SerialNo of p1 : " + p1.serialNo);
		System.out.println("SerialNo of p2 : " + p2.serialNo);
		System.out.println("SerialNo of p3 : " + p3.serialNo);
		System.out.println("Count : " + product1.count);
	}
}


