package abstractTest;

// 추상 클래스를 extends 로 상속받음
public class DeskTop extends Computer{

	
	// 부모 매서드를 상속받아 재정의
	@Override
	public void display() {
		System.out.println("DeskTop display");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing");
		
	}

}
