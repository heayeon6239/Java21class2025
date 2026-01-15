package interfaceTest;

// Calculator 추상 클래스를 extends 로 상속 받음
public class CompleteCalc extends Calculator{
	
	// extends 는 구현체를 상속한다는 의미
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		return ERROR;
	}
	
	// 출력 메서드 생성
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하겠습니다.");
	}
	
	
}
