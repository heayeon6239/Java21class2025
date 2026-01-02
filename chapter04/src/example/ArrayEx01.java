package example;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		// 01. 10부터 50까지 arr배열에 저장
		int[] arr = new int[] {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		// 02. 4의 배수만 출력
		
		// 03. 4의 배수의 합 출력
		int sum = 0;
		// 04.  4의 배수의 개수 출력
		int count = 0;
		// 05. 짝수의 개수 출력
		int count2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				System.out.println(arr[i]);
				sum += arr[i];
				count ++;
			}
			if(arr[i] % 2 == 0) {
				count2 ++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
		System.out.println(count2);
		

	}

}
