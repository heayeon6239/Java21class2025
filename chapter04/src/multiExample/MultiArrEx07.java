package multiExample;

import java.util.Scanner;

public class MultiArrEx07 {

	public static void main(String[] args) {
		
		// <문제10>  각 층별 관리비 합 출력
		
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
		
		int high = 0;
		int highApt = 0;
		int low = pay[0][0];
		int lowApt = 0;
		
		for(int i=0; i<apt.length; i++) {
			for(int j=0; j<apt[i].length; j++) {
				if(high < pay[i][j]) {
					high = pay[i][j];
					highApt = apt[i][j];
				}
				if(low >= pay[i][j]) {
					low = pay[i][j];
					lowApt = apt[i][j];
				}
				
			}
		}
		System.out.println("가장 많이 나온 집: "+highApt+" 가장 적게 나온 집: "+lowApt);
		
	}
	

}
