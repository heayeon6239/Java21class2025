package classpart05;

import java.util.Random;

// 클래스
public class ClassEx05 {
	// 멤버 변수
	int[] answer = {1,3,4,2,5};
	int[] hgd = new int[5];
//	boolean[] jeong = new boolean[5];
	
	
	// 디폴트 생성자
	public ClassEx05() {};
	
	// 01. 랜덤 숫자 5개 출력
	public void randomNum() {
		Random ra = new Random();
		
		for(int i=0; i<hgd.length; i++) {
			int num = ra.nextInt(5)+1;
			hgd[i] = num;
		}
	}
	
	// 02. 채점, 점수
	public int check() {
		int score = 0;
		
		for(int i=0; i<answer.length; i++) {
			if(answer[i] == hgd[i]) {
				score += 20;
				System.out.print("O");
			}else {
				System.out.print("X");
			}
		}
		
		return score;
	}
	
	public void printResult() {
		System.out.println("정답: ");
		
		// < 확장 for문 >
		// 사용방법 : for(자료형 변수 : 배열){실행문;}
		// 확장 for문의 장점
		// 1. index 사용하지 않음
		// 2. 코드가 짧음
		// 3. 요소를 하나씩 처리
		
		// answer의 배열에서 값을 하나 꺼내서 n에 담고 출력(배열이 끝날때까지)
		// 단, index를 가져올 수 없기때문에 배열방의 값을 비교할 때는 사용 불가
		for(int n : answer)
			System.out.print(n+" ");
		System.out.println("\n응답 : ");
		for(int n : hgd)
			System.out.println(n+" ");
		
	}
	
	
}
