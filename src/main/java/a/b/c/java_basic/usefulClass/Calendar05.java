package a.b.c.java_basic.usefulClass;

import java.util.Calendar;

public class Calendar05 {

	public static void main(String[] args) {
		
		// 두 날짜의 개월 수 차이 구하기. 
		String date1 = "200508";
		String date2 = "200405";
		
		int a = Integer.parseInt(date1.substring(0,4))*12 
				+ Integer.parseInt(date1.substring(4));
		int b = Integer.parseInt(date2.substring(0,4))*12 
				+ Integer.parseInt(date2.substring(4));
		System.out.println(Math.abs (a-b)+"개월 차이가 납니다. ");
	}
	
	

}
