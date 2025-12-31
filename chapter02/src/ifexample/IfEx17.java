package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx17 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int randomNum = random.nextInt(50)+1;
		System.out.printf("문제 = %d%n",randomNum);
		// 10의 자리가 3
		int num01 = randomNum/10;
		// 1의 자리가 3,6,9
		int num02 = randomNum%10;
		int num03 = randomNum%30;
		int num04 = 0;
		
		if( num01 == 3 || num01 == 6 || num01 == 9) {
			num04 ++;
		}if( num02 == 3 || num02 == 6 || num02 == 9){
			num04 ++;
		}
		
		if(num04 == 2) {
			System.out.println("짝짝");
		}else if(num04 == 1) {
			System.out.println("짝");
		}else {
			System.out.println(randomNum);
		}
		
		
	}

}
