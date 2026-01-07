package classpart07;

import java.util.Scanner;

public class ClassEx07 {
	// 멤버 변수
	int[] arPrice = { 2500, 3800, 1500, 1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};
	int[] arCount = new int[4]; //각 메뉴별 개수
	int total = 0;
	
	// 디폴트 생성자
	public ClassEx07() {};
	
	// 메서드
	public int ClassEx07(int menu) {
		// 해당 메뉴 수량 증가
		arCount[menu-1] ++;
		// 총 가격
		for(int i=0; i<arMenu.length; i++) {
			total += arPrice[i]*arCount[i];
		}
		return total;
		
	}
	
	// 메인
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 선택:");
		int menu = scan.nextInt();
		// 객체화(인스턴스)
		ClassEx07 ex07 = new ClassEx07();
		ex07.ClassEx07(menu);
		System.out.println(ex07.total);
		
	}

}
