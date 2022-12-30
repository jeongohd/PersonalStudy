package a.b.c.java_basic.array;

public class Array02 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i=0; i<num.length; i++) {
			counter[num[i]]++; 
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.println(i+"의 갯수 : "+counter[i]);
		}
	}

}
