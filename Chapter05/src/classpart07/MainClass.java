package classpart07;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// while()문은 main()메서드에서 작성
		// main() => 계산 로직 X, 저장 로직 X, 처리 로직 X
		// main() => 객체화(인스턴스화), 메서드 호출, 실행 순서 정하기
		
		Scanner scan = new Scanner(System.in);
		
		// 객체화(인스턴스)
		ClassEx07 ex07 = new ClassEx07();
		
		// ClassEx07 클래스에 접근하는 방법(참조변수.멤버변수, 참조변수.메서드)
		ex07.name="맥도날드";
		
		// 순서 정하기
		boolean run = true;
		
		while(run) {
			ex07.printMenu(); // 메뉴출력 함수 호출
			System.out.println("메뉴 선택:");
			int sel = scan.nextInt(); 
			
			// 5번(주문하기)
			if(sel == 5) {
				// 주문 완료
				if(!ex07.hasOrder()) { // false는 주문 안된 상태
					System.out.println("주문내역이 없습니다.");
					continue;
				}
				// 총금액 함수 호출
				else {
					ex07.calcTotal();
					System.out.println("총 금액 :"+ex07.total+"원");
					System.out.println("지불 금액 :");
					int money = scan.nextInt();
					
					if(money < ex07.total) {
						System.out.println("지불 금액이 부족합니다.");
						continue;
					}
					
					// 영수증 클릭 함수 호출
					ex07.printReceipt(money);
					run = false;
				}
			}else if(sel >= 1 && sel <= 4) {
				ex07.order(sel-1); // index는 0부터 시작
			}else {
                System.out.println("다시 선택해주세요.");
            }

		}	

	}

}
