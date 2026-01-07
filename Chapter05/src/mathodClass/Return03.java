package mathodClass;

import java.util.Scanner;

public class Return03 {
	// 멤버 변수
	int num01 = 10;
	int num02 = 20;
	
	public void test02() {
		if(num01 >= num02) {
			System.out.println("크다");
		}
		return; // 반환하지 않는 함수에서의 return => 즉시 메서드종료
	}
	
	// 메인
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 객체화(인스턴스)
		Return03 r3 = new Return03();
		
		while(true) {
			System.out.println("메뉴 출력");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				// 반환하지 않고 즉시 함수 종료
				r3.test02();
			}else {
				System.out.println("종료");
				return; // while()문 종료
			}
		}
	}
	
}
