package a.b.c.java_basic.object;

public class CastingTest {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // 자손 -> 부모
//		car.water(); car는 Car타입이므로 water 메소드 사용 불가. 
		fe2 = (FireEngine)car; // 부모 -> 자손
		fe2.water();
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!");
	}
}