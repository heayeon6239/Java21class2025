package arrayListEx02;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Student 클래스를 ArrayList<>로 생성(큰부모)
		ArrayList<Student> list = new ArrayList<>();
		
		int cnt = 0;
		
		while(cnt < 3) {
			// Student 클래스 객체화(인스턴스화)
			Student sName = new Student();
			
			// 01. 학생 이름 입력
			System.out.println("학생 이름: ");
			sName.name = scan.next(); // Student 클래스의 name 멤버 변수에 접근하여 이름 입력
			
			// 02. 과목명, 점수 입력 2개
			for(int i=0; i<2; i++) {
				// Subject 클래스 객체화(인스턴스화)
				Subject subject = new Subject();
				
				System.out.println("과목: ");
				subject.sub = scan.next();
				System.out.println("점수: ");
				subject.score = scan.nextInt();
				
				// Student 클래스에 과목, 점수 추가
				sName.sublist.add(subject);
			}
			// list 에 학생 추가되어야함
			list.add(sName);
			cnt ++;
			
			// 출력
			for(int i=0; i<list.size(); i++) {
				// = String s, 데이터 타입이 Student
				Student s = list.get(i);
				System.out.printf("학생 이름: %s%n",s.name);
				for(int j=0; j<s.sublist.size(); j++) {
					Subject sub = s.sublist.get(j);
					System.out.println("과목명: "+sub.sub+"점수"+sub.score);
				}
				System.out.println();
			}
		}
		
		

		
	}

}
