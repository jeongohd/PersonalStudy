package a.b.c.java_basic;

public class CountDown {

	public static void main(String[] args) {
		System.out.println("Start CountDown");
		for(int i=10; i>=0; i--) {
			for(long j=0; j < 1000000000; j++) {
				;
			}
			System.out.println(i);
		}
		System.out.println("Finished");
	}

}
