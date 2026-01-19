package capitalGame.copy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {
	Scanner scan = new Scanner(System.in);
	Random ra = new Random();
	HashMap<String, String> game = new HashMap<>();
	
	// 기본 디폴트 생성자
	public Game() {addNation();};
	
	public void addNation() {
		game.put("한국", "서울");
		game.put("미국", "워싱턴DC");
		game.put("일본", "도쿄");
		game.put("러시아", "모스크바");
		game.put("영국", "런던");
	}
	
	// game menu 메서드
	public void gameMenu() {
		boolean run = true;
		System.out.println("**** 수도 맞추기 게임 시작 ****");
		
		while(run) {
			System.out.print("[1]입력  [2]퀴즈  [3]종료");
			int select = scan.nextInt(); // 숫자만 읽고 엔터(공백)를 남김 \n 
			
			switch(select) {
			case 1:
				// 게임 나라, 수도 삽입 메서드
				insertNation();
				break;
			case 2:
				// 게임 Start 메서드
				start();
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				run = false;
				break;
			
			}
		}
	}
	
	// 01. 게임 나라,수도 삽입 메서드
	public void insertNation() {
		int cnt = game.size();
		// 입력을 문자를 받아야 하므로 scan.nextInt()의 이슈인 \n 이 남는 상황을 제거
		scan.nextLine(); // 이전 입력 버퍼정리
		System.out.println("현재"+game.size()+"개 나라의 수도가 입력되었습니다.");
		
		while(true) { // while 문은 true 일때 무한반복(반드시 break 존재)
			System.out.println("나라의 수도 입력"+(game.size()+1)+">>");
			String nation = scan.nextLine();
			// "그만" 입력하면 삽입 종료
			if(nation.equals("그만")) break;
			// 입력된 문자를 구분자를 기준으로 분리해서 담아주는 클래스
			StringTokenizer st = new StringTokenizer(nation);
			String na = st.nextToken().trim(); // 나라
			String ca = st.nextToken().trim(); // 수도
			
			// 이미 저장된 나라와 수도가 존재하면 예외처리
			if(game.containsKey(na)) { // 같은 나라 존재시 true, 아니면 false
				System.out.println("이미 존재하는 나라입니다.");
				continue; // 없으면 밑에 HashMap<>에 저장됨
			}
			
			// HashMap<> 저장
			game.put(na, ca);
		}
	}
	
	// 02. 게임 Start 메서드(삽입한 나라이름을 배열로 전환하는 이슈, 삽입된 나라이름이 랜덤하게 문제에 출력되어야하는 이슈)
	public void start() {
		// ArrayList<>의 매개변수로 game.keyset()의 나라를 사용
		ArrayList<String> nationArr = new ArrayList<>(game.keySet());
		// 랜덤하게 나라이름이 출력되는 문제 만들기
		int index = ra.nextInt(game.size());
		String Q = nationArr.get(index);
		String A = game.get(Q); // key 값이 Q 인 value 값 가져오기 !!
		while(true) {
			System.out.println(Q + "수도는? >>");
			String myA = scan.next();
			
			if(myA.equals("그만")) {
				 break;
			}else if(A.equals(myA)) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
			}
		}
		
		
	}

	
	
}
