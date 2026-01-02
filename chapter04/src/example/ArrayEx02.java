package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int index = 0;
		int score = 0;
		
		// 배열
		int[] arr = {87, 11, 45, 98, 23};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("인덱스를 입력받아 성적 출력");
		// 문제 01
		System.out.println("인덱스 입력:");
		index = scan.nextInt();
		// 문제 02
		System.out.println("성적 입력:");
		score = scan.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			// 문제 01
			if(i == index) {
				System.out.printf("성적:%d점%n",arr[i]);
			}
			// 문제 02
			if(arr[i] == score) {
				System.out.printf("인덱스:%d%n",i);
			}
		}
		
	}

}
