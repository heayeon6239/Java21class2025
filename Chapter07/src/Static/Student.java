package Static;

public class Student {
	// static => 데이터 메모리 영역에 존재, 서로 다른 인스턴스에 같은 값을 공유
	// static 데이터 타입 변수 이름 => 클래스변수라 칭함
	// (static 은 정적이라는 의미)
	static int serialNum = 1000; // 변하지 않음
	
	int studentId;
	String studentName;
	
	// 디폴트 생성자
	// 객체가 생성될 때마다 시리얼넘버를 누적하고 studentId에 담겠다는 의미
	public Student() {
		serialNum ++;
		studentId = serialNum;
	}
}
