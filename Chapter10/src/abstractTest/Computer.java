package abstractTest;

// 추상 클래스는 반드시 abstract 키워드를 입력
public abstract class Computer {
	
	// 추상 클래스 작성이유
	// - 어떻게 구현애야 할지 구체적 방법을 모를때 각 하위 클래스에서 알아서 구현애야 할 때 사용
	
	// 추상클래스는 구현은 하지않고 선언만 하는 메서드 작성
	// public abstract display(){body}, -> body 는 코드를 구현하는 부분
	// 구현체가 존재하지 않는 메서드는 추상메서드
	public abstract void display();
	public abstract void typing();
	
	// 모든 공통으로 구현해야 되는 경우 메서드로 작성
	// 단, body => 코드를 구현하는 구현체까지 작성
	// 구현체가 존재하는 메서드는 추상메서드가 아님
	public void turnOn() {
		System.out.println("전원 ON");
	}
	
	public void turnOff() {
		System.out.println("전원 OFF");
	}
}
