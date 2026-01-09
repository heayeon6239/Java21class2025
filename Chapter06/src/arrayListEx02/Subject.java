package arrayListEx02;

import java.util.ArrayList;

// 클래스
public class Subject {

	// 멤버 변수
	String sub;
	int score;
	
	// 디폴트 생성자
	public Subject() {};
	
	// 이름 배열 생성
	ArrayList<Student> arrStudent = new ArrayList<>();
	
	// 매개변수 생성자
	public Subject(String sub, int score) {
		this.sub = sub;
		this.score = score;
	}
	
	// 이름 추가
	public void add(Student s) {
		arrStudent.add(s);
	}
	
	// 출력
	public void printSubject() {
		
		
	}
}
