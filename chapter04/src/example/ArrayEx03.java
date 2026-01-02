package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int scoreSum = 0;
		
		// 이름 배열
		String[] nameArr = new String[] {"홍길동","개나리","진달래","김백합","최동훈"};
		System.out.println(Arrays.toString(nameArr));
		
		// 점수 배열
		int[] scoreArr = new int[nameArr.length];
		
		for(int i=0; i<nameArr.length; i++) {
			// 점수 입력
			System.out.printf(nameArr[i]+"의 점수를 입력하세요 :");
			score = scan.nextInt();
			scoreSum += score;
			
			// 점수 배열에 넣기
			if(scoreArr[i] == 0) {
				scoreArr[i] = score;
			}else {
				break;
			}
		}
		// ***님의 점수 : 출력
		for(int i=0; i<nameArr.length; i++) {
			System.out.println(nameArr[i]+"의 점수:"+scoreArr[i]);
		}
		
		double scoreAv = (scoreSum / nameArr.length);
		// 평균값 출력
		System.out.println("평균 :"+scoreAv);
	}

}
