package example;

import java.util.*; // 모든 import 가능

public class ArrayEx06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
	
		int score = 0;
		int index = 0;
		
		System.out.println("1등 학생의 학번과 성적");
		
		for(int i=0; i<hakbuns.length; i++) {
			if(scores[i]>score) {
				score=scores[i];
				index = i;
			}
		}
		System.out.println(hakbuns[index]+"번"+"("+score+"점"+")");
		
		
	}

}
