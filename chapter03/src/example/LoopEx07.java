package example;

import java.util.Scanner;

public class LoopEx07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int account = 0;
		int pw = 0;
		
		// 현재 상태
		int now = 2;
		
        
		while(run == true) {
			System.out.println("=============");
			System.out.printf("*상태 : %d%n",now);
			System.out.printf("1. 로그인%n2. 로그아웃%n3. 입금%n4. 출금%n5. 이체%n6. 조회%n0.종료%n메뉴 선택 :");
			int click = scan.nextInt();
			
			// 1. 로그인 눌렀을 때
			if(click == 1) {
				if(now == click) {
					System.out.println("이미 로그인 상태입니다.");
				}else {
					now= 1;
					System.out.println("계좌번호 입력 :");
					account = scan.nextInt();
					System.out.println("비밀번호 입력 :");
					pw = scan.nextInt();
					if((account == dbAcc1 && pw == dbPw1) || (account == dbAcc2 && pw == dbPw2)) {
						System.out.printf("%d님, 환영합니다.%n",account);
//						System.out.println(now); //현재상태 확인용
					}else {
						System.out.println("다시 확인해주세요.");
					}
				}
				
			// 2. 로그아웃 눌렀을 때
			}else if(click == 2) {
				if(now == click) {
					System.out.println("로그인해주세요.");
				}else {
					System.out.println("로그아웃");
					now = 2;
				}
				
			// 3. 입금 눌렀을 때
			}else if(click == 3 && now == 1){
				System.out.println("입금할 금액을 입력해주세요.");
				int input = scan.nextInt();
				// 1111님일 경우
				if(account == 1111) {
					dbMoney1 += input;
				// 2222님일 경우
				}else {
					dbMoney2 += input;
				}
				
				System.out.printf("입금할 금액 입력 : %d원%n",input);
				System.out.printf("입금을 완료하였습니다.%ndbMoney1 = %d원%ndbMoney2 = %d원%n",dbMoney1,dbMoney2);
				
			// 4. 출금 눌렀을 때	
			}else if(click == 4 && now == 1){
				System.out.println("출금할 금액을 입력해주세요.");
				int out = scan.nextInt();
				
				// 출금 금액이 부족할 경우
				if(dbMoney1 < out || dbMoney2 < out) {
					System.out.println("출금 금액이 부족합니다.");
				}else {
					// 1111님일 경우
					if(account == 1111) {
						dbMoney1 -= out;
					// 2222님일 경우
					}else {
						dbMoney2 -= out;
					}
					System.out.printf("출금할 금액 입력 : %d원%n",out);
					System.out.printf("출금을 완료하였습니다.%ndbMoney1 = %d원%ndbMoney2 = %d원%n",dbMoney1,dbMoney2);
				}
				
			// 5. 이체 눌렀을 때
			}else if(click == 5 && now == 1){
				System.out.println("이체할 계좌를 입력해주세요.");
				int passAccount = scan.nextInt();
				System.out.println("이체할 금액을 입력해주세요.");
				int pass = scan.nextInt();
				// 1111님일 경우
				if(account == 1111) {
					dbMoney1 -= pass;
					dbMoney2 += pass;
				// 2222님일 경우
				}else {
					dbMoney2 -= pass;
					dbMoney1 += pass;
				}
				// 출금 금액이 부족할 경우
				if(dbMoney1 < 0 || dbMoney2 < 0) {
					System.out.println("이체 금액이 부족합니다.");
				}else {
					System.out.printf("이체할 금액 입력 : %d원%n",pass);
					System.out.printf("이체을 완료하였습니다.%ndbMoney1 = %d원%ndbMoney2 = %d원%n",dbMoney1,dbMoney2);
				}
				
			// 6. 조회 눌렀을 때
			}else if(click == 6 && now == 1){
				// 1111님일 경우
				if(account == 1111) {
					System.out.printf("1111님의 잔액은 %d원 입니다.%n",dbMoney1);
				// 2222님일 경우
				}else {
					System.out.printf("2222님의 잔액은 %d원 입니다.%n",dbMoney2);
				}
					
			
			// 0. 종료 눌렀을 때
			}else if(click == 0){
				System.out.println("프로그램 종료");
				run = false;
				now = 0;
			// 로그아웃 상태일 때
			}else {
				System.out.println("로그인 후 이용 가능합니다.");
			}
		}
		
	}

}
