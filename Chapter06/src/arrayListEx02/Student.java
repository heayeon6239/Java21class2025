package arrayListEx02;

import java.util.ArrayList;

import arrayListTest.Member;

// 클래스
public class Student {

	// 멤버 변수
	String name;
	// 멤버 변수 ArrayList<Subject> sublist
//	ArrayList<Subject> sublist = new ArrayList<>();
	ArrayList<Subject> sublist ; // (부모)
	
	// 생성자
	public Student() {
		sublist = new ArrayList<>();
	};
	
	// 디폴트 생성자
//	public Student() {};
	
	// 매개변수 생성자
	public Student(String name) {
		this.name = name;
	}

	
	// 출력
	public void printStudent() {
		System.out.printf("학생 이름: %s%n",name);
	}

	
	
	
	
}
