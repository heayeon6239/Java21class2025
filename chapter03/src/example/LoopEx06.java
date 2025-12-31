package example;

import java.util.Scanner;

public class LoopEx06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int count = 1;
		
		// 메뉴 가격
		int bul= 8700;
		int shrimp = 6200;
		int cola = 1500;
		System.out.printf("1. 불고기 버거 : %d원 %n2. 새우 버거 : %d원 %n3. 콜라 : %d원%n", bul,shrimp,cola);
		
		// 
		int bulCount = 0;
		int shrimpCount = 0;
		int colaCount = 0;
		int price = 0;
		
		while(count <= 5) {
			System.out.println("메뉴 선택 : ");
			int menu = scan.nextInt();
			count ++;
			if(menu == 1 ) {
				price += bul;
				bulCount ++;
			}else if(menu == 2) {
				price += shrimp;
				shrimpCount ++;
			}else {
				price += cola;
				colaCount ++;
			}
		}
        System.out.printf("총 금액 :%d원%n",price);
        System.out.println("현금 입력 : ");
        int cash = scan.nextInt();
        // 예외처리
        int change = cash - price;
        if(change < 0) {
        	System.out.println("돈이 부족합니다.");
        }else {
        	System.out.println("=== 롯데리아 영수증 ===");
            System.out.printf("불고기 버거 : %d개%n새우  버거 : %d개%n콜     라 : %d개%n총  금  액 : %d원%n잔     돈 : %d원"
            		,bulCount,shrimpCount,colaCount,price,change);
        }
        
	}

}
