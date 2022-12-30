package a.b.c.java_basic.usefulClass;

import java.util.Calendar;

public class Calendar04 {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("error");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		int start_day_of_week = 0;
		int end_day = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1); // ★ 다음 달에서 -1을 해주어 이번달 말일을 구할 수 있음.
		
		start_day_of_week = sDay.get(Calendar.DAY_OF_WEEK); // 1일의 요일을 구함.
		end_day = eDay.get(Calendar.DATE); // 마지막 일이 몇일인지 구함. 
//		System.out.println(end_day);  31
		
		System.out.println(args[0]+"년"+ args[1]+"월");
		System.out.println(" su mo tu we th fr sa");
		
		for(int i=1; i<start_day_of_week; i++) { // 첫 일이 해당하는 요일에 맞게 출력시키기 위해. 
			System.out.print("   ");
		}
		
		for(int i=1, n=start_day_of_week; i<= end_day; i++, n++) {
			System.out.print((i<10? "  "+i: " "+i));
			if(n%7==0) System.out.println();
		}
		
		
		
	}
		
		
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) + "월 "
				+ date.get(Calendar.DATE)+"일";
	}

}
