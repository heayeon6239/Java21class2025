package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		// 랜덤 숫자
		int randomNum01 = random.nextInt(10)+1;
		int randomNum02 = random.nextInt(10)+1;
		// 랜덤 연산자
		int randomNum03 = random.nextInt(4)+1;
		// 랜덤 연산자의 정답
		int answer = 0;
		
		if(randomNum03 == 1) {
			answer = randomNum01 + randomNum02;
		}else if(randomNum03 == 2) {
			answer = randomNum01 - randomNum02;
		}else if(randomNum03 == 3) {
			answer = randomNum01 * randomNum02;
		}else{
			answer = randomNum01 % randomNum02;
		}
		
		System.out.printf("%d ? %d =%d%n",randomNum01,randomNum02,answer);
		
		System.out.println("번호를 선택하세요: ");
		int answer01 = scan.nextInt();
		
		if(randomNum03 == answer01) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
	}

}
