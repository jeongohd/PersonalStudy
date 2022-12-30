package a.b.c.java_basic.object;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	static long factorial(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		} else {
			result = n * factorial(n-1);
		}
		return result;
	}

}
