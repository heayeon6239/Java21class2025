package multiExample;

import java.util.Scanner;

public class MultiArrEx03 {

	public static void main(String[] args) {
		
		// <문제6>  2차원배열 기본문제[2단계]
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		int result = 0;
		int num01 = 0;
		int num02 = 0;
		int num03 = 0;
		
		
		// 변경 전
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = result + 10;
				result = arr[i][j];
				System.out.print(result+" ");
			}
			System.out.println();
		}
		
		System.out.println("인덱스1 입력: ");
		int index01 = scan.nextInt();
		System.out.println("인덱스2 입력: ");
		int index02 = scan.nextInt();
		System.out.println("인덱스3 입력: ");
		int index03 = scan.nextInt();
		System.out.println("인덱스4 입력: ");
		int index04 = scan.nextInt();
		
		// 자료 구조 stack을 이용한 로직
		num01 = arr[index01][index02];
		num02 = arr[index03][index04];
		num03 = num02;
		arr[index03][index04] = num01;
		arr[index01][index02] = num03;
		
		// 변경 후
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
				System.out.println();
		}

	}
	

}
