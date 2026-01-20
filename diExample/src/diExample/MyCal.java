package diExample;

public class MyCal {
	
	public void all(int num01, int num02, Ical ical) {
		int result = ical.doOper(20, 10);
		System.out.println(result);
	}
	
	// 1단계 : 계산기 클래스 생성
	// 2단계 : MyCal 클래스의 메서드들을 모듈(=부품)화할 예정
	// 3단계 : 공통 인터페이스를 도입
	// 4단계 : DI(의존성 객체)를 주입 => 외부로부터 객체 주입publi
	
	
	// 더하기, 빼기, 곱하기, 나누기 메서드(add, sub, mul, div) 작성
	// 접근 제어자 public / 데이터 반환 없이 void 이용 / print문으로 출력 / 매개변수 int num01, int num02 를 이용
	
// -------------------------------------------------------------------------------------------------------
	
//	public void add(int num01, int num02, Ical ical) {
//		// Ical ical => Ical 이라는 데이터 타입으로 구현된 어떤 객체든 이자리에 들어올 수 있음(Ical ical = new Add() 안해도 됨)
////		Add add = new Add();
////		Ical ical = new Add(); // 인터페이스는 인스턴스화는 못해도 데이터타입으로는 사용 가능!!
//		int result = ical.doOper(20, 10);
//		System.out.println(result);
//	}
//	
//	public void sub(int num01, int num02, Ical ical) {
////		Sub sub = new Sub();
////		Ical ical = new Sub();
//		int result = ical.doOper(20, 10);
//		System.out.println(result);
//	}
//	
//	public void mul(int num01, int num02, Ical ical) {
////		Mul mul = new Mul();
////		Ical ical = new Mul();
//		int result = ical.doOper(20, 10);
//		System.out.println(result);
//	}
//	
//	public void div(int num01, int num02, Ical ical) {
////		Div div = new Div();
////		Ical ical = new Div();
//		int result = ical.doOper(20, 10);
//		System.out.println(result);
//	}
	
}
