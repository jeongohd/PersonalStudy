package a.b.c.java_basic.array;

import javax.swing.JOptionPane;

public class Array04_JOptionPane {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1; // 1~100
		int input = 0;
		String temp = "";
		int count = 0;
		
		do {
			count++;
			temp = JOptionPane.showInputDialog("input number between 1 and 100. If you want to finish this, input -1");
			
			if(temp == null || temp.equals("-1")) break;
			
			System.out.println("value : "+ temp);
			input = Integer.parseInt(temp);
			
			if(answer>input) {
				System.out.println("input higher number"); 
			} else if (answer < input) {
				System.out.println("input lower number");
			} else {
				System.out.println("correct");
				System.out.println("you've tried "+count+ " times");
				break;
			}
		} while(true);
		
		
	}

}
