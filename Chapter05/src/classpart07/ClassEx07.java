package classpart07;

import java.util.Scanner;

public class ClassEx07 {
	// 멤버 변수(전역 변수)
	int[] arPrice = { 2500, 3800, 1500, 1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};
	int[] arCount = new int[4]; //각 메뉴별 개수
	int total = 0;
	String name;
	
	// 디폴트 생성자(객체 생성 시 초기화에 필요한 디폴트 생성자, 반드시 클래스이름과 동일해야함)
	public ClassEx07() {};
	
	// 01. 메뉴 출력(void는 반환할 값이 없는 메서드 생성할 때 사용)
	public void printMenu() {
		System.out.println("\n["+name+"]");
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i+1)+":"+arMenu[i]+"("+arPrice[i]+"원)");
		}
		System.out.println("5. 주문하기");
	}
	
	// 02. 주문 추가 함수
	public void order(int sel) {
		// 해당 메뉴 수량 증가
		arCount[sel] ++;
		System.out.println(arMenu[sel]+"추가됨");
	}
	
	// 03. 총금액 계산 함수
	public void calcTotal() {
		total = 0;
		// 총 가격
		for(int i=0; i<arMenu.length; i++) {
			total += arPrice[i]*arCount[i];
		}
	} // total을 return하지 않아도 되는 이유 : total이 전역변수이기 때문에
	
	// 04. 주문 여부를 확인하는 함수(반환할 값이 필요한 경우 반드시 데이터 타입으로 메서드 작성)
	public boolean hasOrder() {
		for(int i=0; i<arMenu.length; i++) {
			if(arCount[i] > 0) {
				return true; // 주문됨
			}
		}
		return false; // 주문안됨
	}
	
	// 05. 영수증 출력 함수
	public void printReceipt(int money) {
		System.out.println("==== 영수증 ====");
		System.out.println(name);
		System.out.println("---------------");
		System.out.println("메뉴\t수량\t금액");
		for(int i=0; i<arMenu.length; i++) {
			if(arCount[i]>0) {
				System.out.println(arMenu[i]+"\t"+arCount[i]+"\t"+(arPrice[i]*arCount[i]));
			}
		}
		System.out.println("합계금액"+total+"원");
		System.out.println("받은금액"+money+"원");
		System.out.println("잔돈"+(money-total)+"원");
	}
	

}
