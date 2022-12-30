package a.b.c.java_basic.usefulClass;

import java.io.File;
import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File("ScannerData02.txt"));
		int cnt = 0;
		int totalSum = 0; 
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;
			while(sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			System.out.println(line + ", sum : " +sum);
			totalSum += sum;
		}
		System.out.println("totalSum : " + totalSum);
	}

}
