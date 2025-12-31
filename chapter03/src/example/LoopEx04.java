package example;

import java.util.Scanner;

public class LoopEx04 {

	public static void main(String[] args) {
//		<문제> while  반복문 종료(-100)
//		1. 무한 반복을 하면서 숫자를 입력 받는다.
//		2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		// while(조건) = true는 무한루프
		while(run == true) {
			System.out.println("수 입력 : ");
			int num = scan.nextInt();
			if(num == -100) {
				System.out.println("종료");
				run = false;
			}
		}
//        System.out.println("종료");

	}

}
