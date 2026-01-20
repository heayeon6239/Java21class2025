package otShop;

import java.util.Scanner;

public class Shopping extends UserMenu{
	// 인스턴스
	ItemManager it = new ItemManager();
	Scanner scan = new Scanner(System.in);
	String menu ="[1]로그인 [2]로그아웃 [3]쇼핑 [0]종료\n";
	String manaMenu ="[1]로그아웃 [2]아이템관리 [3]장바구니 리스트\n";
	String itemMenu ="[1]item추가 [2]item삭제 [3]item수정 [0]종료\n";
	
	// 메뉴
	public void menu() {
		while(true) {
			System.out.println();
			System.out.print(menu);
			System.out.print("메뉴선택: ");
			int select = scan.nextInt();
			
			if(select == 1) {
				login(); 
				if(log == 0) {
					managerMenu();
				}
			}else if(select == 2) {
				logout(); 
			}else if(select == 3) {
				// 쇼핑은 반드시 로그인 상태
				if(log < 0) { // (log = -1 이면 로그아웃)
					System.out.println("로그인 후 이용 가능");
				}else { // (로그인)
					 shopMenu();
				}
			}else {
				System.out.println("쇼핑몰 종료");
				break;
			}
		}
		
	}
	
	// ShopMenu() 메서드
	public void shopMenu() {
		while(true) {
			System.out.println();
			System.out.println("[1]쇼핑목록 [2]장바구니 [0]뒤로가기\n");
			int select = scan.nextInt();
			
			if(select == 0) {
				break; // 뒤로가기
			}else if(select == 1) {
				it.printCategory();
				System.out.println("쇼핑목록 선택 [뒤로가기 -1]");
				int caId = scan.nextInt();
				
				int n = 0;
				for(int i=0; i<it.itemList.size(); i++) {
					// 존재하지 않는 카테고리 작성 예외처리
					if(it.category.get(caId).equals(it.itemList.get(i).category)) { 
						System.out.println("["+i+"]");
						it.itemList.get(i).printInfo();
					}
				}
				System.out.print("항목 선택: ");
				int itemId = scan.nextInt();
				// 항목 추가(장바구니 cart 에 담기)
				it.addCart(super.id[log], caId, itemId);
			}else if(select == 2) {
				System.out.println("================ 장바구니 =================");
				for(int i=0; i<it.jangList.size(); i++) {
					// 해당 아이디의 장바구니 출력
					if(it.jangList.get(i).userId.equals(id[log])) { 
						it.jangList.get(i).printCart();
					}
				}
				System.out.println("=========================================");
			}
		}
	}
	
	// 매니저 메뉴 메서드
	public void managerMenu() {
		while(true) {
			System.out.println();
			System.out.print(manaMenu);
			System.out.print("메뉴선택: ");
			int select = scan.nextInt();
			
			if(select == 1) {
				logout();
				break;
			}else if(select == 2) {
				itemMage();
			}else {
				System.out.println("=========== 전체 장바구니 리스트 ============");
				it.printJang();
				System.out.println("=========================================");
			}
		}
	}
	
	// 아이템 관리 메뉴
	public void itemMage() {
		while(true) {
			System.out.println();
			System.out.print(itemMenu);
			System.out.print("메뉴선택: ");
			int select = scan.nextInt();
			
			if(select == 1) {
				System.out.println("추가할 item 이름 입력: ");
				String addName = scan.next();
				System.out.println("추가할 item 금액 입력: ");
				int addPrice = scan.nextInt();
				System.out.println("추가할 item 카테고리 번호 입력: ");
				int addCategory = scan.nextInt();
				it.addItem02(addName, addPrice, addCategory);
				// 출력
				it.printItem();
			}else if(select == 2) {
				System.out.println("삭제할 item 번호 입력: ");
				int delIndex = scan.nextInt();
				it.delItem(delIndex);
				// 출력
				it.printItem();
			}else if(select == 3) {
				System.out.println("수정할 item 번호 입력: ");
				int updateIndex = scan.nextInt();
				System.out.println("수정할 item 이름 입력: ");
				String updateName = scan.next();
				System.out.println("수정할 item 가격 입력: ");
				int updatePrice = scan.nextInt();
				it.update(updateIndex, updateName, updatePrice);
				// 출력
				it.printItem();
			}else {
				System.out.println("아이템 관리 종료");
				break;
			}
		}
	}
	
	// 로그인 메서드
	public void login() {
		if(log > -1) {
			System.out.println("이미 로그인 중");
		}else {
			log = super.userLog();
		}
	}
	
	// 로그아웃 메서드
	public void logout() {
		if(log < 0) {
			System.out.println("이미 로그아웃 상태");
		}else {
			log = -1;
			System.out.println("안녕히계세요.");
		}
	}
}
