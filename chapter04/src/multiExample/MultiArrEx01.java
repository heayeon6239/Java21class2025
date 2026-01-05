package multiExample;

public class MultiArrEx01 {

	public static void main(String[] args) {
		
		// <문제1>  2차원배열 기본문제[1단계]
		int[][] arr = new int[3][3];
		int result = 0;
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = result + 10;
//				result = arr[i][j];
//				System.out.print(result+" ");
//			}
//			System.out.println();
//		}
		
		// <문제2>  2차원배열 기본문제[1단계]
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = result + 10;
				result = arr[i][j];
				sum += result;
				System.out.print(result+" ");
			}
			System.out.println();
		}
		System.out.println("정답:"+sum);
		
		// <문제3>  2차원배열 기본문제[1단계]
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = result + 10;
//				result = arr[i][j];
//				if(result % 4 == 0 && result != 0) {
//					System.out.print(result+" ");
//				}
//			}
//		}
		
		// <문제4>  2차원배열 기본문제[1단계]
		int resultSum = 0;
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = result + 10;
//				result = arr[i][j];
//				if(result % 4 == 0 && result != 0) {
//					resultSum += result;
//					System.out.print(result+" ");
//				}
//			}
//		}
//		System.out.print(resultSum);
	}
	

}
