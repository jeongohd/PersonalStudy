package a.b.c.java_basic.usefulClass;

import java.util.StringTokenizer;

public class StringTokenizer02 {

	public static void main(String[] args) {
		
		String input = "삼십만삼천백십오";
		System.out.println(input);
		System.out.println(hangulToNum(input));
		

	}

	public static long hangulToNum(String input) {
		long result = 0;
		long tmpResult = 0;
		long num = 0;
		
		final String NUMBER = "영일이삼사오육칠팔구";
		final String UNIT = "십백천만억조";
		final long[] UNIT_NUM = {10, 100, 1000, 10000
				,(long)Math.pow(10, 9) ,(long)Math.pow(10, 12)};
		
		StringTokenizer st = new StringTokenizer(input, UNIT, true);
		// 삼십만삼천백십오, 십백천만억조, true -> 단위로 쪼갬
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			int check = NUMBER.indexOf(token); // 숫자인지, 단위인지 확인용.
			if(check==-1) { // 단위(UNIT)일 경우
				if("만억조".indexOf(token)==-1) { // 만단위 이하일 경우.
					tmpResult += (num!=0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
				} else {
					tmpResult += num;
					result += (tmpResult!=0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
					tmpResult = 0;
				}
				num = 0;
			} else { // 숫자일 경우
				num = check; 
			}
		}
		return result + tmpResult + num;
	}
	
	

}
