package multiExample;

import java.util.Scanner;

public class MultiArrEx02 {

	public static void main(String[] args) {
		
		// <문제5>  2차원배열 기본문제[2단계]
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		int result = 0;
		int indexResult = 0;
		
		System.out.println("인덱스1 입력: ");
		int index01 = scan.nextInt();
		System.out.println("인덱스2 입력: ");
		int index02 = scan.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = result + 10;
				result = arr[i][j];
				System.out.print(result+" ");
			}
			System.out.println();
		}
		indexResult = arr[index01][index02];
		System.out.print(indexResult);
		
	}
	

}
