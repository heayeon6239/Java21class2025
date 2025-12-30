package ifexample;

import java.util.Scanner;

public class IfEx14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cash= 20000;
		int balance = 30000;
		int account = 11111;
		int password = 1234;
		
		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int start = scan.nextInt();
		
		// 종료
		if(start == 2) {
			System.out.println("종료");
			
		// 로그인
		}else {
			System.out.println("계좌와 비밀번호를 입력하세요");
			int myAccount = scan.nextInt();
			int myPassword = scan.nextInt();
			
			// 계좌와 비밀번호가 틀렸을 때
			if(myAccount != account || myPassword != password) {
				System.out.println("계좌와 비밀번호를 확인해주세요");
				
			// 계좌와 비밀번호가 맞을 때
			}else {
				System.out.println("1.입금 2.출금 3.조회");
				int want = scan.nextInt();
				
				// 입금
				if(want == 1) {
					System.out.println("입금할 금액을 입력하세요");
					int money = scan.nextInt(); // 입금할 금액
					int charge = balance + money; // 통장잔액
					int cashCharge = cash - money; // 현금잔액
					System.out.printf("입금 후 통장잔액 : %d원 %n입금 후 내 현금 잔액 : %d원", charge,cashCharge);
					
				// 출금
				}else if(want == 2) {
					System.out.println("출금할 금액을 입력하세요");
					int money = scan.nextInt(); // 출금할 금액
					int charge = balance - money; // 통장잔액
					int cashCharge = cash + money; // 현금잔액
					System.out.printf("출금 후 통장잔액 : %d원 %n입금 후 내 현금 잔액 : %d원", charge,cashCharge);
					
				// 조회
				}else{
					System.out.printf("현재 통장잔액은 %d원 입니다",cash);
				}
			}
		}
		scan.close();
	}
}
