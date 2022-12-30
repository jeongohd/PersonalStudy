package a.b.c.java_basic.usefulClass;

import java.util.StringTokenizer;

public class StringTokenizer03 {
	
	// StringTokenizer는 빈 값을 넣지 않음.  

	public static void main(String[] args) {
		
		String data = "100,,,200,300";
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data,",");
		
		System.out.println("split한 갯수 : "+result.length);
		
		int i = 0;
		for(;st.hasMoreTokens(); i++) {
			System.out.print(st.nextToken() + "|");
		}
		System.out.println("개수 : "+i);
		
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	
	

}
