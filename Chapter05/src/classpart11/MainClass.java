package classpart11;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		ClassEx11 ex11 = new ClassEx11();
		
		// class로 인스턴스화한 변수(scan)은 참조변수라고 함
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		System.out.println("태스트 :"+ex11.inputHakbun(1005));
		
		while(run) {
			// 메인 출력문
			System.out.println("=== 메가IT 고등학교 ===");
			System.out.println("1. 전교생 성적확인");
			System.out.println("2. 1등학생 성적확인");
			System.out.println("3. 꼴등학생 성적확인");
			System.out.println("4. (학번은 입력받아) 성적확인");
			System.out.println("5. 종료하기");
			
			System.out.println("메뉴 선택 :");
			int menu = scan.nextInt(); 
			
			// 01. 전교생 성적확인
			if(menu == 1) {
				ex11.allScore();
			}
			// 02. 1등학생 성적확인
			else if(menu == 2) {
				ex11.first();
			}
			// 03. 꼴등학생 성적확인
			else if(menu == 3) {
				ex11.last();
			}
			// 04. (학번은 입력받아) 성적확인
			else if(menu == 4) {
				System.out.println("학번을 입력하세요.");
				int hakbun = scan.nextInt();
				System.out.println(ex11.inputHakbun(hakbun));
				
			}
		}
	}

}
