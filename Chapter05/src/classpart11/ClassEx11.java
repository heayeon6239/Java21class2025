package classpart11;

// 클래스
public class ClassEx11 {

	// 멤버변수
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore = { 92, 38, 87, 100, 11};
	
	// 디폴트 생성자
	public ClassEx11() {};

	// 01. 전교생 성적확인
	public void allScore() {
		for(int i=0; i<arScore.length; i++) {
			System.out.println((i+1)+"."+arHakbun[i]+"학번"+" ("+arScore[i]+"점)");
		}
	}
	
	// 02. 1등학생 성적확인
	public void first() {
		int score = 0;
		int first = 0;
		for(int i=0; i<arScore.length; i++) {
			if(score < arScore[i]) {
				score = arScore[i];
				first = i;
			}
		}
		System.out.println("1등 학생 = "+arHakbun[first]+"학번("+arScore[first]+"점)");
	}
	
	// 03. 꼴등학생 성적확인
	public void last() {
		int score = arScore[0];
		int last = 0;
		for(int i=0; i<arScore.length; i++) {
			if(score > arScore[i]) {
				score = arScore[i];
				last = i;
			}
		}
		System.out.println("꼴등 학생 = "+arHakbun[last]+"학번("+arScore[last]+"점)");
	}
	
	// 04. (학번은 입력받아) 성적확인
	public int inputHakbun(int hakbun) {
		int score = 0;
		int find = 0;
		for(int i=0; i<arHakbun.length; i++) {
			if(hakbun == arHakbun[i]) {
				score = arScore[i];
				find = 1;
				break;
			}
		}
		if(find == 0) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		return score;
	}
}
