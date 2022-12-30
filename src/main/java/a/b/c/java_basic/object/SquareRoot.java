package a.b.c.java_basic.object;

public class SquareRoot {

	public static void main(String[] args) {
		
		// 2 + 2*2 + 2*2*2 + 2*2*2*2 + 2*2*2*2*2; 
		
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			result += square(x,i);
		}
		System.out.println(result); 
		
	}
	
	static long square(int x, int n) {
		if (n==1) return x;
		return x * square(x, n-1);
	}

}
