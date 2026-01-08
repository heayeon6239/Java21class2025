package classpart10;

import java.util.Random;

public class ClassEx10 {
	// 멤버변수

	
	// 디폴트 생성자
	public ClassEx10() {};
	
	// 랜덤 점수
	public void test(int[] x) {
		Random ran = new Random();
		System.out.print("[");
		for(int i=0; i<x.length; i++) {
			x[i] = ran.nextInt(100)+1;
			System.out.print(x[i]+" ");
		}
		System.out.print("]");
	}
	
	// 총점
	public int sum(int[] x) {
		int score = 0;
		for(int i=0; i<x.length; i++) {
			score += x[i];
		}
		return score;
	}
	
	// 평균
	public double avg(int[] x) {
		// ★ 함수 호출해서 변수에 담기 (각각의 메서드(return)는 호출 가능)
		int sum = sum(x); 
		// 명시적 형변환(int -> double)
		return (double)sum / x.length;
	}
	
	// 1등 점수
	public int first(int[] x) {
		int first = 0;
		for(int i=0; i<x.length; i++) {
			if(first < x[i]) {
				first = x[i];
			}
		}
		return first;
	}
	
	// 꼴등 점수
		public int last(int[] x) {
			int last = x[0];
			for(int i=0; i<x.length; i++) {
				if(last > x[i]) {
					last = x[i];
				}
			}
			return last;
		}
		
}
