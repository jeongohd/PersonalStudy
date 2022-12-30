package a.b.c.java_basic;

public class String03 {
	
	// 필드
	private String source="";
	private int length;
	private StringBuffer buffer;
	
	// 생성자
	public String03(String source) {
		this.source = source;
		length = source.length();
		buffer = new StringBuffer(length+100);
	}
	
	// 메소드
	public int length() {
		return length;
	}
	
	public String replace(String old, String nw) {
		return replace(old, nw, 0);
	}
	
	public String replace(String old, String nw, int pos) {
		int idx=0;
		if(old==null || nw==null) {
			return "null";
		}
		if ((idx = source.indexOf(old, pos)) != -1) {
			buffer.append(source.substring(pos, idx));
			buffer.append(nw);
			
			// 발견한 위치 이후부터 다시 치환 시작. 
			replace(old,nw,idx+old.length());
		} else {
			// 더 이상 치환할 문자열을 찾지 못하면 나머지 문자열을 buffer에 저장. 
			buffer.append(source.substring(pos));
		}
		return buffer.toString();
	} 
	
	
	
	public static void main(String[] args) {
		String str = "000111222333111222333";
		System.out.println(str);
		System.out.println(str.replace("222", "BBB"));
		String03 st = new String03(str);
		System.out.println(st.replace("111", "AAA"));
	}

}
