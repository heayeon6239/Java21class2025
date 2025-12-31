package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		// 랜덤 수
		int num01 = random.nextInt(100)+1;
		System.out.printf("문제[%d]%n",num01);
		System.out.printf("1.홀수 %n2.짝수 %n번호를 선택하세요: ");
		// 홀 or 짝
		int num02 = scan.nextInt();
		// 2로 나눴을 때 나머지
		int num03 = num01 % 2;
		
		// 랜덤 수: 짝수 && 번호: 2.짝수 || 랜덤 수: 홀수 && 번호: 1.홀수
		if((num03 == 0 && num02 == 2) || (num03 != 0 && num02 == 1)) {
			System.out.println("정답");
		// 오답
		}else {
			System.out.println("오답");
		}
		
		scan.close();
	}

}
