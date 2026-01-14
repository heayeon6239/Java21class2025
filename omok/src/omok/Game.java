package omok;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	Scanner scan = new Scanner(System.in);

	GameElements ge = new GameElements();
	
	boolean run = true;
	boolean start = true;

	// 기본 디폴트 생성자
	public Game() {
	};

	// 흑돌, 백돌 빈배열 생성
//	int[][] black = new int[13][13];
//	int[][] white = new int[13][13];

	// 선택한 자리가 중복인지 확인하는 메서드
	public boolean overlap(int row, int column) {
		for (int i = 0; i < ge.arr.length; i++) {
			for (int j = 0; j < ge.arr[i].length; j++) {
				if (i == row - 1 && j == column - 1) {
					ge.arr[i][j].equals(" - ");
					return true; // 빈칸이면 true
				}
			}
		}
		return false; // 빈칸이 아니면 false
	}

	// 선택한 자리 오목 놓기 메서드
	int turn = 0; // 누구 차례인지 확인

	public void place(int row, int column) {

		for (int i = 0; i < ge.arr.length; i++) {
			for (int j = 0; j < ge.arr[i].length; j++) {
//				ge.arr[i][j] = " - ";
				if (i == row - 1 && j == column - 1) {
					// 흑돌 차례일 경우
					if (turn == 0) {
						ge.arr[i][j] = " ● ";

						turn++;
//						break;
					}
					// 백돌 차례일 경우
					else {
						ge.arr[i][j] = " ○ ";
						turn++;
//						break;
					}
				}
				System.out.print(ge.arr[i][j]);
			}
			System.out.println();
		}
		if (turn > 1) { // 한번씩 게임 진행하면 2->0 으로 변경하여 반복
			turn = 0;
		}
	}

	// win(5개) 확인 메서드
	public void win(int rowDol, int columnDol) {
		int row = rowDol -1;
		int column = columnDol -1;
		String now = ge.arr[row][column]; // 현재 내가 둔 돌의 색
		
		// 가로로 숫자가 늘어나는지
		int count01 = 0;
		for (int i = column; i < ge.arr.length; i++) {
			if (ge.arr[row][i].equals(now)) {
				count01++;
			}else break;
		}
		
		// 가로로 숫자가 줄어드는지
		for (int i = column; i >= 0; i--) {
			if (ge.arr[row][i].equals(now)) {
				count01++;
			}else break;
		}
		
		// 5개가 되면 win
		if(count01 == 5) {
			start = false;
//			return true; // win
			System.out.println("승");
		}
		
		// ===================================================================
		
		// 세로로 숫자가 늘어나는지
		int count02 = 0;
		for (int i = row; i < ge.arr.length; i++) { // 13-1 = 12
			if (ge.arr[i][column].equals(now)) {
				count02++;
			}else break;
		}
		
		// 가로로 숫자가 줄어드는지
		for (int i = column; i >= 0; i--) { // 13-1 = 12
			if (ge.arr[i][column].equals(now)) {
				count02++;
			}else break;
		}
		
		// 5개가 되면 win
		if(count02 == 5) {
			start = false;
//			return true; // win
			System.out.println("승");
		}
		
		// ===================================================================
		
		// 대각선 위로 
		int count03 = 0; // [4,11]
		for (int i = row; i > ge.arr.length-column; i--) { // (4,3,2,1,0)
			for(int j =column; j < ge.arr.length; j++){ // 13-4=9 (1,2,3,4,5,6,7,8)
				if (ge.arr[i][j].equals(now)) {
					count03++;
					System.out.println(count03);
				}else break;
			}
		}
		
		// 대각선 아래 [0,8]
		for (int i = row; i < ge.arr.length-column; i++) { // (4,3,2,1,0)
			for(int j =column; j > ge.arr.length; j++){ // 13-4=9 (1,2,3,4,5,6,7,8)
				if (ge.arr[i][j].equals(now)) {
					count03++;
					System.out.println(count03);
				}else break;
			}
		}
		
		// 5개가 되면 win
		if(count03 >= 5) {
			start = false;
//			return true; // win
			System.out.println("승");
		}
		
		// ===================================================================
		
//		return false;
	}

	// 게임 메뉴
	public void menu() {


		while (run) {
			System.out.println("[오목]");
			System.out.println("[1]게임 시작");
			System.out.println("[2]전적 확인");
			System.out.println("[3]종료");
			System.out.println("메뉴 선택:");
			int menu = scan.nextInt();
			// [1]게임 시작
			if (menu == 1) {
				System.out.println("오목 게임 시작 (플레이어1: 흑돌, 플레이어2: 백돌)");
				ge.omokBase(); // 오목 판 출력
				while (start) {
					System.out.println("플레이어1 차례 - 놓을 위치를 선택하세요");
					System.out.println("세로(1~13) : ");
					int row = scan.nextInt();
					System.out.println("가로(1~13) : ");
					int column = scan.nextInt();
					place(row, column);
					win(row, column);
				}

			}

		}
	}

}
