package ifexample;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int dbId=0;
//		int dbPw=0;
		
		System.out.println("=== 회원가입 ===");
		System.out.print("가입할 Id를 입력하세요 : ");
		int dbId = scan.nextInt();
		System.out.print("가입할 Pw를 입력하세요 : ");
		int dbPw = scan.nextInt();
		System.out.print("가입을 축하합니다.");
		
		System.out.println("=== 로그인 ===");
		System.out.print("ID 입력 : ");
		int id = scan.nextInt();
		System.out.print("PW 입력 : ");
		int pw = scan.nextInt();
		
		if(dbId == id && dbPw == pw) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}

}
