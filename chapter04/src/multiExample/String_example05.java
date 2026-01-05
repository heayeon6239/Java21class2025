package multiExample;

import java.util.Scanner;

public class String_example05 {

	public static void main(String[] args) {
		
		// <문제>  쇼핑몰 [관리자]
		Scanner scan = new Scanner(System.in);
		// 객체 데이터 타입이 기본값은 null
		String[][] items = new String[100][2];
		// 공백으로 초기화 (null값을 해결하기위해)
		for(int i=0; i<items.length; i++) {
			for(int j=0; j<items[i].length;j++) {
				items[i][j] = "";
			}
		}
		
		// 프로그램 실행, 종료 표시
		boolean run = true;
		// 카테고리 인덱스
		int addCount = 0;
		int addCount02 = 0;
		
		while(run) {
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아이템 관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[0]종료");
			
			System.out.println("관리자 모드를 선택 :");
			int click = scan.nextInt();
			
			
			
			// 01. 카테고리 추가
			if(click == 1) {
				System.out.println("추가할 카테고리 입력:");
				String addCate= scan.next();
				
				items[addCount][0] = addCate;
				addCount ++;
				System.out.println(addCount);
				
			}
			// 02. 아이템 추가
			else if(click == 2) {
				System.out.println("추가할 카테고리 선택:");
				int cate= scan.nextInt();
				System.out.println("추가할 아이템 입력:");
				String addItem= scan.next();
				addCount02 ++;
				
				items[cate][1] += addItem+"/";

				
			}
			// 03. 전체품목 출력
			else if(click == 3) {
//				for(int j=0; j<2; j++) {
//					for(int i=0; i<addCount02; i++) {
//						System.out.println(items[i][j]);
//					}
						for(int i=0; i<addCount02; i++) {
							System.out.println(items[i][0]+": "+items[i][1]);
						}

			}else {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		
		
		
		
	}
}
