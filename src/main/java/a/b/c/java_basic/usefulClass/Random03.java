package a.b.c.java_basic.usefulClass;

import java.util.Arrays;
import java.util.HashSet;

public class Random03 {
	
	final static int RECODE_NUM = 10;
	final static String TABLE_NAME = "TEST_TABLE";
	final static String[] CODE1 = {"010","011","017","018","019"};
	final static String[] CODE2 = {"남자","여자"};
	final static String[] CODE3 = {"10대","20대","30대","40대","50대"};
	
	
	public static void main(String[] args) {
		for(int i=0; i<RECODE_NUM; i++) {
			System.out.printf("insert into %s values ('%s','%s','%s','%s);\n"
					, TABLE_NAME, getRandArr(CODE1), getRandArr(CODE2)
					, getRandArr(CODE3), getRand(100,200));
		}
	}
	
	public static String getRandArr(String[] strs) {
		return strs[getRand(strs.length-1)];
	}
	
	
	public static int getRand(int num) {
		return getRand(0,num);
	}
	public static int getRand(int from, int to) {
		return (int)(Math.random()*(Math.abs(to-from)+1)) 
				+ Math.min(from, to);
	}

}
