package abstractTest;

public class ComputerTest {

	public static void main(String[] args) {
		// 추상 클래스는 인스턴스(객체화) 할 수 없음
		//Computer com = new Computer();
		// Computer 추상클래스를 상속받고 있는 하위클래스의 데이터 타입으로 업캐스팅은 가능 => 다형성이 성립
		// 다형성의 성립요건 => 상속, 오버라이딩, 업캐스팅
		Computer com1 = new DeskTop();
		// Computer com2 = new NoteBook();  -> 추상클래스여서 업캐스팅 불가
		Computer com2 = new MyNoteBook();
		com1.display(); // DeskTop
		com1.typing(); // DeskTop
		com2.display(); // MyNoteBook
		com2.typing(); // MyNoteBook
		

	}

}
