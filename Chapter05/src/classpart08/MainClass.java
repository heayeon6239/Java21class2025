package classpart08;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		ClassEx08 ex08 = new ClassEx08();
		
		Scanner scan = new Scanner(System.in);
		
		ex08.name = "Mega Bank"; // 이름
		
		boolean run = true; 
		
		while(run) {
			ex08.mainPrint(); // 메인화면 출력
			System.out.println("선택 :");
			int menu = scan.nextInt(); // 메뉴 입력
			
			// 0번(종료)
			if(menu == 0) {
				run = false;
			}
			// 1번(회원가입)
			else if(menu == 1) {
				System.out.println("계좌:");
				String account = scan.next();
				System.out.println("비번:");
				String pw = scan.next();
				System.out.println("금액:");
				int money = scan.nextInt();
				ex08.menuClick01(account,pw,money);
				// ★ boolean으로 줬을 경우 3항연산자 사용 가능
				// System.out.println(ex08.menuClick01(account,pw,money)?"가입성공":"가입실패");
			}
			// 2번(로그인)
			else if(menu == 2) {
				System.out.println("계좌:");
				String account = scan.next();
				System.out.println("비번:");
				String pw = scan.next();
				ex08.menuClick02(account,pw);
			}
			// 3번(로그아웃)
			else if(menu == 3) {
				ex08.menuClick03();
			}
			// 4번(입금)
			else if(menu == 4 && ex08.loginCheck != -1) {
				System.out.println("입금액 : ");
				int money = scan.nextInt();
				ex08.menuClick04(money);
			}
			// 5번(이체)
			else if(menu == 5 && ex08.loginCheck != -1) {
				System.out.println("상대 계좌 : ");
				String account = scan.next();
				System.out.println("이체 금액 : ");
				int money = scan.nextInt();
				ex08.menuClick05(account,money);
			}
			// 6번(잔액조회)
			else if(menu == 6 && ex08.loginCheck != -1) {
				System.out.println(ex08.menuClick06());
			}
			// 0번(종료)
			else {
				run = false;
			}
		}

	}

}
