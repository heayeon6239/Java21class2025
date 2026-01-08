package classpart10;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEx10 ex10 = new ClassEx10();
		int[] score = new int[5];
		System.out.print("학생점수 :"); 
		ex10.test(score);
		//System.out.println(ex10.test(score));
		System.out.println("\n총합: "+ex10.sum(score));
		System.out.println("평균: "+ex10.avg(score));
		System.out.println("1등 점수: "+ex10.first(score));
		System.out.println("꼴등 점수: "+ex10.last(score));
		
	}

}
