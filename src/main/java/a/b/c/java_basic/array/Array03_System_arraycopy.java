package a.b.c.java_basic.array;

public class Array03_System_arraycopy {

	public static void main(String[] args) {
		
		char[] abc = {'A','B','C','D'};
		char[] num = {'1','2','3','4','5','6','7','8','9'};
		System.out.println(new String(abc)); // new String(char[] chars);
		System.out.println(new String(num)); 
		
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(new String(result));
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(new String(num));
		
		System.arraycopy(abc, 0, num, 5, 3);
		System.out.println(new String(num));
		
	}

}
