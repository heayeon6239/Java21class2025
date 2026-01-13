package shopMol;

import java.util.Scanner;

public class Shopping extends UserMenu{
	
	// ItemManager인스턴스
	ItemManager im = new ItemManager();
	
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
				System.out.println("["+id[i]+"]님, 환영합니다.");
				super.log = i; // 로그인된 아이디 인덱스 번호로 log 변경
				return;
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
	public void shopMenu(int shopMenu) {
		for(int i=0; i<im.itemList.size(); i++) {
			if(im.itemList.get(i).category.equals(im.category.get(shopMenu))) {
				System.out.println("["+i+"]"+"["+im.itemList.get(i).name+"]"+"["+im.itemList.get(i).price+"]"+"["+im.itemList.get(i).category+"]");
			}
		}
	}
	
	// 쇼핑메뉴 프린트 메서드
	public void printShop() {
		System.out.println();
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
				System.out.println("쇼핑목록 선택:");
				int Menu = scan.nextInt();
				shopMenu(Menu);
			}
			// [0] 종료
			if(menu == 0) {
				run = false;
			}
		}
		
	}

}
