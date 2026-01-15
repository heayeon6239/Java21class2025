package abstractTest;

class define{
	public static final int MIN = 1;
	public static final int MAX = 9999;
	public static final int ENG = 1001;
	public static final int MATH = 2001;
	public static final double PI = 3.14;
	public static final String GOOD_MORNING = "good morning";
}

public class FinalTest {

	public static void main(String[] args) {
		// Final 예약어
		// final 변수는 값이 변경될 수 없는 상수 
		// 예) public static final double pi = 3.14 (재할당 pi = 3.0 X) => 메서드
		//    final a = 20; X
		
		// final 메서드는 하위 클래스에서 재정의 X   
		// final 클래스는 상속 X
		// final 선언과 동시에 할당하거나 또는 생성자에서 한번만 할당

		// static 키워드로 작성된 변수는 인스턴스하지 않아도 접근 가능 !!
		System.out.println(define.GOOD_MORNING);
		System.out.println("영어과목 코드는"+define.ENG+"입니다.");
		System.out.println("수학과목 코드는"+define.MATH+"입니다.");
		
//		define.PI = 3.1; // final 은 재할당 안됨!! (The final field define.PI cannot be assigned)
		double num = define.PI * 1000;
		System.out.println(num);
	}

}
