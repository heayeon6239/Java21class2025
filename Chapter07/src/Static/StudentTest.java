package Static;

import PrivateEx.PrivateTest;

public class StudentTest {

	public static void main(String[] args) {
		
		// 인스턴스화 = 객체화
		Student st01 = new Student();
//		System.out.println(Student.serialNum); // 1000
//		System.out.println(st01.serialNum); // 1000(static 으로 작성된 클래스 변수는 인스턴스하지 않아도 접근 가능) 
		
		Student st02 = new Student();
		// st02.serialNum++; 
		// st02 참조변수 생성 후, 시리얼넘버를 누적해도 데이터 메모리 영역에서 값을 모든 참조변수(st01, st02)에 공유
//		System.out.println(st02.serialNum); // 1001
//		System.out.println(st01.serialNum); // 1001
		
		System.out.println("st03 참조변수 ====");
		Student st03 = new Student();
		System.out.println(st01.studentId);
		System.out.println(st02.studentId);
		System.out.println(st03.studentId);
		System.out.println("serialNum 값은 공유됨");
		System.out.println(st01.serialNum);
		System.out.println(st02.serialNum);
		System.out.println(st03.serialNum);
		
		// static 클래스 변수는 인스턴스화 하지 않아도 접근 가능ㄴ
		System.out.println(Student.serialNum);
		
		PrivateTest pit = new PrivateTest();
		pit.setDay(20); // set(수정)은 출력 X
		System.out.println(pit.getDay());
	}

}
