package multiExample;

import java.util.Scanner;

public class MultiArrEx06 {

	public static void main(String[] args) {
		
		// <문제09>  각 층별 관리비 합 출력
		
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
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");
		int ho = scan.nextInt();
		int ho_pay = 0;
		
		for(int i=0; i<apt.length; i++) {
			for(int j=0; j<apt[i].length; j++) {
				if(ho == apt[i][j]) {
					ho_pay = pay[i][j];
					
				}
				
			}
		}
		System.out.println("입력"+ho+" "+"관리비 출력"+ho_pay);
		
	}
	

}
