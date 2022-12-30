package a.b.c.java_basic.usefulClass;

import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"", "일","월","화","수","목","금","토"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		System.out.println(date1);
		
		date1.set(date1.get(Calendar.YEAR), 0, 1); // 2022-1-1
		System.out.println(toString(date1) + " " +
				DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일");
		System.out.println(toString(date2) + " " +
				DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("올 해부터 "+difference +"초 지났음.");
		System.out.println("일 수로 계산하면 " + difference/(60*60*24)+"일 지났음.");
	}
	
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) + "월 "
				+ date.get(Calendar.DATE)+"일";
	}

}
