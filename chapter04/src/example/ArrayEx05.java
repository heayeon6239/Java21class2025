package example;

import java.util.*; // 모든 import 가능

public class ArrayEx05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		Boolean none = false;
		
		System.out.println("학번 입력:");
		int inputHakbuns = scan.nextInt();
		
		for(int i=0; i<hakbuns.length; i++) {
			if(hakbuns[i] == inputHakbuns) {
				none = true;
				System.out.printf("성적 : %d",scores[i]);
			}
		}
		if(none != true) {
			System.out.println("해당학번은 존재하지 않습니다.");
		}
		
	}

}
