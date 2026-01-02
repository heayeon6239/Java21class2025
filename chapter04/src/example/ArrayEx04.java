package example;

import java.util.*; // 모든 import 가능

public class ArrayEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		
		System.out.println("학번 입력:");
		int inputHakbuns = scan.nextInt();
		
		for(int i=0; i<hakbuns.length; i++) {
			if(hakbuns[i] == inputHakbuns) {
				System.out.printf("성적:%d점%n",scores[i]);
			}
		}
		
	}

}
