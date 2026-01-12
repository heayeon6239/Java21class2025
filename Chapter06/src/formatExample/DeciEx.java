package formatExample;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DeciEx {

	public static void main(String[] args) {
		
		// DecimalFormat 클래스는 예약어 new로 객체를 생성하여 사용ㄴ
		// DecimalFormat("#,##0) => 따옴표 안에 출력할 숫자의 형식을 입력
		// => 0은 숫자 0을 0으로 출력, #은 숫자 0을 공백으로 출력(단, 첫 숫자가 존재하면 뒤의 0은 공백으로 출력되지않음)
		
		Scanner scan = new Scanner(System.in);
		int number;
		
		DecimalFormat num01 = new DecimalFormat("0,000");
		DecimalFormat num02 = new DecimalFormat("#,###");
		DecimalFormat num03 = new DecimalFormat("#,##0");
		// 유니코드 \u00A4 => 원화 화페출력
		DecimalFormat num04 = new DecimalFormat("\u00A4#,###");
		
		System.out.println("값 입력 :");
		number = scan.nextInt();
		
		System.out.println(num01.format(number)); // 0,000
		System.out.println(num02.format(number)); // 0
		System.out.println(num03.format(number)); // 0
		System.out.println(num04.format(number)); // ₩1,500
	}

}
