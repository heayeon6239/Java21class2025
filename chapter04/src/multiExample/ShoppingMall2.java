package multiExample;

import java.util.Scanner;

public class ShoppingMall2 {

	public static void main(String[] args) {
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111", "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
	
		int itemCount00 = 0;// 같은 상품이 이미 담겼는지 확인하는 카운트
		int itemCount01 = 0;// 같은 상품이 이미 담겼는지 확인하는 카운트
		int itemCount02 = 0;// 같은 상품이 이미 담겼는지 확인하는 카운트
		
		int MAX_SIZE = 100;
		// 장바구니 배열
		int[][] jang = new int[MAX_SIZE][2];
		// 회원별 상품, 수량 담는 배열
		int[][] cart = new int[ids.length][items.length];
		// 실행 종료 상태
		boolean run = true;
		// 로그인 상태 변수
		String login = null;
		// ids의 인덱스 담는 변수
		int idIndex = 0;
		// 상품번호
		int item = 0; 
		// 상품 카운트(장바구니 배열 인덱스)
		int itemCount = 0;  
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			
			// 로그인 상태
			if(login != null) {
				System.out.println("상태: "+login);
			}
			// 로그아웃 상태
			else {
				System.out.println("상태: 로그아웃");
				// 로그아웃 상태일 때 쇼핑, 장바구니를 클릭했을때의 예외처리
			}
			
			System.out.println("--------------");
			System.out.println("[ GREEN MART ]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			
			// 1번(로그인) 선택
			if(menu == 1) {
				// 이미 로그인 상태일 경우
				if(login != null) {
					System.out.println("이미 로그인 상태입니다.");
				}
				// 로그인 
				else {
					System.out.print("ID입력 : ");
					String id = scan.next();
					System.out.print("PW입력 : ");
					String pw = scan.next();
					
					// id와 pw 일치 확인
					for(int i=0; i<ids.length; i++) {
						// id, pw 배열과 비교 후 일치하는지 찾기
						if(ids[i].equals(id) && pws[i].equals(pw) && ids[i].isEmpty()==true && pws[i].isEmpty()==true) {
							login = id;
							idIndex = i;
							break; // break없으면 그냥 넘어감
						}
					}
					// 일치할 경우
					if(login == id) {
						System.out.println(id+"님, 환영합니다.");
					}else {
						System.out.println("아이디와 비밀번호를 확인해주세요.");
					}
				}

				
			}
			// 2번(로그아웃) 선택
			else if(menu == 2) {
				if(login == null) {
					System.out.println("이미 로그아웃 상태입니다.");
				}else {
					login = null;
					System.out.println("로그아웃되었습니다.");
				}
			}
			// 3번(쇼핑) 선택
			else if(menu == 3) {
				// 로그인 상태로 선택
				if(login != null) {
					
					while(item != 4) {
						System.out.println("상품번호를 선택하세요:");
						System.out.println("[상품목록]");
						System.out.println("[1]사과");
						System.out.println("[2]바나나");
						System.out.println("[3]딸기");
						System.out.println("[4]뒤로가기");
						item = scan.nextInt();
						
						// max_size 100이 넘어가면 예외처리
						if(itemCount == MAX_SIZE) {
							System.out.println("장바구니가 찼습니다");
							break;
						}
						
						// ids별 쇼핑한 items별들의 개수를 cartCount에 담음
						jang[itemCount][0] = idIndex;
						// 장바구니 1번째열에 내가 산 item index 번호를 담음
						jang[itemCount][1] = item-1;
						// id별 쇼핑한 item들의 개수를 item별로 cartCount에 담음
						// log=0 -> qwer, item-1 =0 -> 사과
						// cartCount[0][0] = cartCount[0][0] +1 
						// int 초기값은 0
						cart[idIndex][item-1] ++; 
						itemCount ++;
						
					}
				}
				// 로그아웃 상태로 선택(실행안됨)
				else {
					System.out.println("로그인을 먼저 해주세요.");
					continue; // 밑으로 안내려가도록 막아줌
				}
			}
			// 4번(장바구니) 선택
			else if(menu == 4) {
				// 로그인 상태로 선택
				if(login != null) {
					
					
					System.out.println("--- 내 장바구니 목록 ---");
					for(int i=0; i<items.length; i++) {
						System.out.println(items[i]+": "+cart[idIndex][i]+"개");
					}
	
				}
				// 로그아웃 상태로 선택(실행안됨)
				else {
					System.out.println("로그인을 먼저 해주세요.");
				}
			}
		}
		
	}
	

}
