package a.b.c.java_basic.usefulClass;

import java.io.File;
import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File("ScannerData.txt"));
		int sum = 0;
		int cnt = 0;
		
		while (sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}
		System.out.println(sum);
		System.out.println(sum/cnt);
	}

}
