package a.b.c.java_basic;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;


public class Exception01{
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("error.log", true); // error.log파일에 출력할 준비
			ps = new PrintStream(fos);
			System.setErr(ps); // err의 출력을 화면이 아닌, error.log파일로 변경.
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (Exception ae) {
			System.err.println("-------------------");
			System.err.println("예외발생시간 : " +new Date());
			ae.printStackTrace(System.err);
			System.err.println("예외메시지 : " + ae.getMessage());
			System.err.println("-------------------");
		}
		System.out.println(6);
	}

}
