package interfaceTest;

public interface Calc {
	// java 7버전 이전에는 구현코드가 있는 메서드가 존재 불가 X
	// java 8버전 이후에는 구현코드가 있는 메서드가 존재 가능 O (현재는 21버전)
	// 인터페이스에서 멤버 변수는 public static final 인 상수로 지정
	
	public static final double PI = 3.14;
	
	// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수(final)로 변환됨!!!
	int ERROR = -99999;
	
	// 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상메서드로 변환됨 (abstract 안써도 자동 생성)
	public abstract int add(int num1, int num2); 
	
	// 인터페이스에서 구현체({body})가 존재하지 않는 메서드는 abstract 키워드로 작성하든 안하든 무조건 추상메서드!!!!
	// (* 추상메서드는 {body} 구현부분이 존재하지 않음)
	// 인터페이스는 인스턴스 X
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// java 버전 8 이후 -------------------------------------------------------------
	
	// 01. 디폴트 메서드 : 기본 구현을 가지는 메서드로 구현코드를 재정의 가능
	default void description() {
		System.out.println("점수 계산을 구현하시오");
		myMethod(); // 내부에서만 사용 가능
	}
	
	// 02.정적 메서드 : 인스턴스 생성과 상관없이 인터페이스 타입으로 사용 가능
	static int total(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		myStaticMethod();
		return total;
	}
	
	// 03. private 메서드 : 인터페이스 내부에서만 사용 가능 (구현한 클래스에서 사용, 재정의 X)
	private void myMethod() {
		System.out.println("private 메서드");
	}
	// private static 메서드
	private static void myStaticMethod() {
		System.out.println("myStaticMethod 메서드 입니다.");
	}
}
