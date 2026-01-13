package inheritance02;

public class ColorTV extends TV{
	// 멤버 변수
	int color = 0;
	
	public ColorTV() {};
	
	// 매개변수 생성자
	public ColorTV(int size, int color) {
		super.size = size; // 부모 TV에게 size값 전달
//		size = size; // size는 부모에게서 상속받은 변수이기 때문에, super를 안해도 가능은 함
//		super.setSize(size); setSize()로도 수정 가능
		this.color = color; // 본인에게 전달
	}
	
	// 출력 메서드
	public void printProperty() {
		// size는 부모에게 상속받은 변수, 자식 클래스에 존재하는것처럼 사용 가능
		System.out.print(size+"인치"+color+"컬러");
	}
}
