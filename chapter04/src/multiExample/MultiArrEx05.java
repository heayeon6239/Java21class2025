package multiExample;

import java.util.Scanner;

public class MultiArrEx05 {

	public static void main(String[] args) {
		
		// <문제08>  각 층별 관리비 합 출력
		
		int[][] apt = {
				{101, 102, 103},
				{201, 202, 203},
				{301, 302, 303}
		};
		int[][] pay = {
				{1000, 2100, 1300},
				{4100, 2000, 1000},
				{3000, 1600, 800}
		};
		
		int sum = 0;
		
		for(int i=0; i<apt.length; i++) {
			sum = 0;
			for(int j=0; j<apt[i].length; j++) {
				sum += pay[i][j];
			}
			System.out.println(sum);
		}
		
		
	}
	

}
