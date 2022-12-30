package a.b.c.java_basic.object;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("money you have is "+ b.money);
		System.out.println("your BonusPoint is "+ b.bonusPoint);
	}

}

class Product{
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv() {
		super(100); // tv가격 100만원으로 설정. 
	}
	public String toString() { // Object클래스의 toString()을 오버라이딩.
		return "TV";
	}
}

class Computer extends Product {
	Computer(){
		super(200);
	}
	public String toString() { 
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("short of money");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println("you bought " + p);
	}
}

