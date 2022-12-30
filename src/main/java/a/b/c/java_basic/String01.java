package a.b.c.java_basic;

public class String01 {

	public static void main(String[] args) {
		String fullName = "Hello.java";
		int idx = fullName.indexOf(".");
		System.out.println(idx);
		String fileName = fullName.substring(0,idx);
		System.out.println(fileName);
		String ext = fullName.substring(idx+1);
		System.out.println(ext);
	}

}
