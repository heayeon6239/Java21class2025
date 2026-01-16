package capitalGame;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RunMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ra = new Random();
		boolean run = true;
		HashMap<String, String> game = new HashMap<>();
		
		// HashMap 에 기본 데이터 삽입
		String[] con = {"러시아","미국","일본","한국","영국","프랑스"};
		String[] cap = {"모스크바","워싱턴DC","도쿄","서울","런던","파리"};
		
		for(int i=0; i<con.length; i++) {
			game.put(con[i], cap[i]);
		}
		
		// 게임 시작
		while(run) {
			
			System.out.println("*** 수도 맞추기 게임을 시작합니다 ***");
			System.out.println(game);
			System.out.print("[1]입력  [2]퀴즈  [3]종료");
			String menu = scan.nextLine();
			
			// [1]입력
			if(menu.equals("1")) {
				System.out.println("현재 "+game.size()+"개 나라의 수도가 입력되어 있습니다.");
				boolean run2 = true;
				
				while(run2) {
					System.out.print("나라와 수도 입력"+(game.size()+1)+">>");
					String input = scan.nextLine();
					
					if(input.equals("그만")) {
						run2 = false;
						break;
					}else {
						StringTokenizer st = new StringTokenizer(input); // 공백을 기준으로 분리
						String country = st.nextToken().trim();
						String capital = st.nextToken().trim();
						
						Game G = new Game(country,capital); // Game 인스턴스(while 문 돌때마다 생성)
						game.put(G.getCountry(),G.getCapital());
					}
					
				}
				
			}
			// [2]퀴즈
			else if(menu.equals("2")) {
				int num = ra.nextInt(game.size())+1;
				System.out.println(num);
				
				for(String g : game.keySet()) {
					System.out.println(g+"의 수도는?");
					String A = scan.next();
					
					if(A.equals(game.get(g))) {
						System.out.println("정답");
					}else {
						System.out.println("오답");
					}
				}
				
			}
			// [3]종료
			else {
				run = false;
				System.out.println("게임을 종료합니다.");
			}
		}

	}

}
