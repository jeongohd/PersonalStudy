package a.b.c.java_basic;

public class String02 {

	public static void main(String[] args) {
		String str = "aabbccAABBCCaa";
		String02 sc = new String02(str);
		System.out.println("aa의 갯수 : "+sc.stringCount("aa"));
	}
	
	
	// 필드
	private int count;
	private String source = ""; 
	
	// 생성자
	public String02(String source) {
		this.source = source;
	}
	
	// 메소드
	public int stringCount(String s) {
		return stringCount(s,0); 
	}
	
	public int stringCount(String s, int pos) {
		int idx = 0;
		if(s == null || s.length() == 0) {
			return 0;
		}
		if ((idx = source.indexOf(s, pos)) != -1) { // indexOf(String, int) 해당 문자열을 int 부터 찾고,
			count++;
			stringCount(s, idx+s.length()); // 재귀호출(찾은 문자열 이 후 부터 다시 찾음) 
		}
		return count;
	}

}



