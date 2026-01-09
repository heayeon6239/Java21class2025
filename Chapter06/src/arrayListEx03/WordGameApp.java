package arrayListEx03;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 인스턴화
		Player p = new Player();
		
		// 배열 생성
		// ArrayList의 제너릭의 데치터 타입으로 Player라는 클래스를 사용함
		ArrayList<Player> nameList = new ArrayList<>();
		// nameList[0] = "홍길동"
		// nameList[1] = "개나리"
		// nameList[2] = "진달래"
		
		// 단어
		String firstWord = "아버지";
		
		// 입력 단어
		String inputWord = "";
		
		System.out.println("참가자 수를 입력하세요.");
		int num = scan.nextInt(); // 참가자 수
		
		// 참가자 생성
		for(int i=0; i<num; i++) {
			System.out.println((i+1)+"번 참가자 이름: ");
			String name = scan.next();
			// ArrayList<>에 추가하는 함수 add()
			nameList.add(new Player(name));
		}
		
		System.out.println("게임 시작!");
		System.out.println("현재 단어: "+firstWord);
		
		int turn = 0; // 현재 차례순서
		while(true) {
			// Player 클래스 데이터 타입
			// ArrayList<>에서 원하는 인덱스 값 출력하는 메서드 -> get(index)
			Player currentPlayer = nameList.get(turn);
			String nextWord = scan.next();
			
			// 끝말잇기 체크
			char lastChar = firstWord.charAt(firstWord.length()-1);
			char firstChar = nextWord.charAt(0);
			
			if(lastChar != firstChar) {
				System.out.println("게임 종료!");
				System.out.println("진 참가자: "+currentPlayer.name);
				break;
			}
			
			// 단어 교체
			firstWord = nextWord;
			turn ++;
			
			// 순서가 끝나면 다시 처음으로
			if(turn == nameList.size()) {
				turn = 0;
			}
		}
		
		

	}

}
