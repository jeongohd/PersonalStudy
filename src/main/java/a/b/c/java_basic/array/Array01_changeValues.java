package a.b.c.java_basic.array;

import java.util.Arrays;

public class Array01_changeValues {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] = (int)(Math.random()*10)); // 0~9
		}
		System.out.println();
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length; i++) {
			boolean changed = false; // 자리가 바뀌었는지 체크.
			for(int j=0; j<num.length-1-i; j++){
				if(num[j] > num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					changed = true;
				}
			}
			if(!changed) break;
		}
		System.out.println(Arrays.toString(num));
	}

}
