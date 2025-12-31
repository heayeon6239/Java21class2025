package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		// 랜덤 수
		int randomNum = random.nextInt(100)+150;
		System.out.printf("문제 = %d%n",randomNum);
		System.out.println("가운데 숫자를 입력하세요: ");
		int num = scan.nextInt();
		int num01 = (randomNum%100)/10;
		
		if(num01 == num) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
	}

}
