package shopMol;

import java.util.Scanner;

public class ManagerMenu extends ItemManager{
	
	public ManagerMenu() {};
	
	Scanner scan = new Scanner(System.in);
	
	boolean ManagerRun = true;
	
	public void ManagerMenu() {
		
		while(ManagerRun) {
			System.out.println("[1]로그아웃");
			System.out.println("[2]아이템 관리");
			System.out.println("[3]장바구니 리스트");
			
			System.out.println("메뉴 선택");
			int menu = scan.nextInt();
			
			// [1]로그아웃
			if(menu == 1) {
				
			}
			// [2]아이템 관리
			else if(menu == 2) {
				System.out.println("[1]item 추가");
				System.out.println("[2]item 삭제");
				System.out.println("[3]item 수정");
				System.out.println("[0]종료");
				
				System.out.println("메뉴 선택");
				int menu01 = scan.nextInt();
			}
			// [3]장바구니 리스트
			else if(menu == 3) {
				
			}
			// 예외 처리
			else {
				System.out.println("메뉴를 다시 선택해주세요.");
			}
		}
	}
}
