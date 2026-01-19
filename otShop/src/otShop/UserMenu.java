package otShop;

import java.util.Scanner;

// User 클래스 상속받기
public class UserMenu extends User{
	// 상속받은 User 클래스의 (멤버변수, 생성자, 메서드)를 인스턴스를 하지 않아도 접근 가능
	
	Scanner scan = new Scanner(System.in);
	int cnt = id.length; // 전체 유저 수(6명)
	static int logindex; // 로그인한 유저 index(다른 클래스와 공유) ※ 좋은 방법은 아님
	
	// 사용자 로그인 메서드
	public int userLog() {
		// super : 부모 클래스의 멤버 변수 접근할 때 사용하는 키워드
		int log = super.log; // 부모인 User 클래스의 log 상태 사용
		System.out.print("ID 입력: ");
		String myId = scan.next();
		System.out.print("PW 입력: ");
		String myPw = scan.next();
		
		// id, pw 로 로그인 성공과 실패 작성
		for(int i=0; i<cnt; i++) {
			if(myId.equals(id[i]) && myPw.equals(pw[i])) {
				log = i; // 성공 -> 로그인된 user 인덱스 저장
			}
		}
		
		// if 문으로 비교
		if(log < 0) {
			System.out.println("아이디와 비밀번호 확인 요망");
		}else if(log == 0) {
			System.out.println("당신은 관리자");
		}else {
			System.out.printf("[%s]님 환영합니다.",id[log]);
			logindex = log; // 다른 클래스에서 사용하기 위해 static 으로 저장
		}
		return log;
	}
}
