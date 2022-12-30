package a.b.c.java_basic.usefulClass;

import java.util.Calendar;

public class Calendar02 {

	public static void main(String[] args) {
		
		final int[] TIME_UNIT = {3600, 60, 1}; // 큰 단위를 앞에 놓음. 
		final String[] TIME_UNIT_NAME = {"시간","분","초"};
		
		Calendar time1 = Calendar.getInstance(); // 현재 시간이 설정. 
		Calendar time2 = Calendar.getInstance();
		
		// time1 - 10시 20분 30초
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		// time2 - 20시 30분 10초
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println(toString(time1));
		System.out.println(toString(time2));
		
		long difference = (time2.getTimeInMillis()-time1.getTimeInMillis())/1000; 
		System.out.println(difference+"초 차이");
		
		String tmp ="";
		for(int i=0; i < TIME_UNIT.length; i++) {
			tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			difference %= TIME_UNIT[i];
		}
		System.out.println("시분초로 변환 시 "+tmp);
		
	}
		
		
	public static String toString(Calendar date) {
		return date.get(Calendar.HOUR_OF_DAY)+"시 "+ (date.get(Calendar.MINUTE)) + "분 "
				+ date.get(Calendar.SECOND)+"초";
	}

}
