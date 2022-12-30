package a.b.c.java_basic.collections;

import java.util.TreeSet;

public class TreeSet02 {
	
	// TreeSet - 저장할 때 정렬함.
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int score[] = {80,95,50,35,45,65,10,100};
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		System.out.println(set);
		
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		System.out.println("50보다 작은 값 : " + set.tailSet(50));
		
		// TreeSet에 배열을 담고, headSet(), tailSet()으로 출력. 
	}

}
