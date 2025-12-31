package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		Random random = new Random();
		
		System.out.println("이용할 정거장 수를 입력하세요:");
		int num = scan.nextInt();
		int price = 0;
		int add = (num - 9)/2;
		
		if(num > 0 && num <= 5) {
			price = 500;
		}else if(num >= 6 && num <= 10) {
			price = 600;
		}else{
			price = 600+add*50;
		}
		
		System.out.printf("요금:%d ",price);
		
	}

}
