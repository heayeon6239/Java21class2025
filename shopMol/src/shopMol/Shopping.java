package shopMol;

import java.util.Scanner;

public class Shopping extends UserMenu{
	
	// ItemManager 인스턴스
	ItemManager im = new ItemManager();
	
	// Cart 인스턴스
	Cart c = new Cart();
	
	// ManagerMenu 인스턴스
	ManagerMenu mm = new ManagerMenu();
	
	Scanner scan = new Scanner(System.in);
	
	// 멤버 변수
	String ID = null;
	String PW = null;
	boolean run = true;
	
	// 로그인 메서드
	public void login(String inputID, String inputPW) {
		this.ID = inputID;
		this.PW = inputPW;
		for(int i=0; i<super.id.length; i++) {
			if(super.id[i].equals(ID) && super.pw[i].equals(PW)) {
				// 관리자일 경우
				if(super.id[i].equals("mmm") && super.pw[i].equals("123")) {
					System.out.println("당신은 관리자 입니다.");
					// 관리자 메뉴 클래스 출력
					
				}else {
					System.out.println("["+id[i]+"]님, 환영합니다.");
					super.log = i; // 로그인된 아이디 인덱스 번호로 log 변경
					return;
				}
				
			}
		}
		System.out.println("아이디와 비밀번호를 확인해주세요.");
	}
	
	// 로그아웃 메서드
	public void logout() {
		if(super.log == -1) {
			System.out.println("이미 로그아웃 상태입니다.");
		}else {
			super.log = -1;
			System.out.println("로그아웃되었습니다.");
		}
	}
	
	// 쇼핑메뉴
	public void shopMenu() {
		System.out.println("[1]쇼핑목록");
		System.out.println("[2]장바구니");
		System.out.println("[0]뒤로가기");
	}
	
	// 쇼핑목록
	public void shoppingList(int shopMenu) {
		for(int i=0; i<im.itemList.size(); i++) {
			if(im.itemList.get(i).category.equals(im.category.get(shopMenu))) {
				System.out.println("["+i+"]"+"["+im.itemList.get(i).name+"]"+"["+im.itemList.get(i).price+"]"+"["+im.itemList.get(i).category+"]");
			}
		}
	}

	
	//메뉴
	public void menu() {
		while(run) {
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]종료");
			System.out.print("메뉴선택: ");
			int menu = scan.nextInt();
			
			// [1] 로그인
			if(menu == 1) {
				System.out.println("ID 입력: ");
				String inputID = scan.next();
				System.out.println("PW 입력: ");
				String inputPW = scan.next();
				login(inputID,inputPW); // 내부의 아이디와 비번 체크하는 메서드 호출
			}
			// [2] 로그아웃
			if(menu == 2) {
				logout(); // 내부의 로그아웃 메서드 호출
			}
			// [3] 쇼핑
			if(menu == 3) {
				shopMenu(); // 쇼핑메뉴 출력
				int Menu01 = scan.nextInt();
				
				// [1]쇼핑목록
				if(Menu01 == 1) {
					System.out.println("[0]과자");
					System.out.println("[1]생선");
					System.out.println("[2]육류");
					System.out.println("[3]음료수");
					System.out.println("카테고리 선택:      [뒤로가기 -1]");
					int cate = scan.nextInt();
					// [-1]뒤로가기
					if(cate == -1) {
						continue;
					}
					// 카테고리 선택할 경우
					else {
						shoppingList(cate); // 해당 카테고리 상품항목 출력
						System.out.println("상품 선택: ");
						int selItem = scan.nextInt();
						c.addCart(super.id[log],im.itemList.get(selItem));
					}
					
				}
				// [2]장바구니
				else if(Menu01 == 2) {
					System.out.println("=========== 내 장바구니 ===========");
					c.printOneCart(super.id[log]);
					System.out.println("=================================");
				}
				
				
			}
			// [0] 종료
			if(menu == 0) {
				run = false;
			}
		}
		
	}

}
