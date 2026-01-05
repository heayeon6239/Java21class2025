package multiExample;

import java.util.Scanner;

public class MultiArrEx04 {

	public static void main(String[] args) {
		
		// <문제7>  2차원배열 기본문제[3단계]
		
		int sum01 = 0;
		int sum02 = 0;
		
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
				}; 
		
		for(int i=0; i<arr.length; i++) {
			sum01 = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum01 += arr[i][j];
			}
			System.out.print(sum01 + " ");
		}
	
		System.out.println();
		
		for(int j=0; j<arr[0].length; j++) {
			sum02 = 0;
			for(int i=0; i<arr.length; i++) {
				sum02 += arr[i][j];
			}
			System.out.print(sum02+" ");
		}
		
	}
	

}
