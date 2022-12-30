package a.b.c.java_basic.object;

public class OverrideTest {

	public static void main(String[] args) {
		
	}

}

class Override {
	
	int x,y;
	
	Override(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : "+ y;
	}
}

class Override2 extends Override {
	int z;
	Override2(int x, int y, int z){
		super(x,y); // 생성자 첫 줄에 상속한 생성자를 호출하지 않으면 오류. 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return super.getLocation() + ", z : "+z;
	}
	
}