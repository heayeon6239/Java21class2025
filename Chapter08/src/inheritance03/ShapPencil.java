package inheritance03;

public class ShapPencil {
	// 멤버변수
	int residual = 0;
	int thickness = 0;
	
	// 기본 디폴트 생성자
	public ShapPencil() {};
	
	// 매개변수 생성자
	public ShapPencil(int residual, int thickness ) {
		this.residual = residual;
		this.thickness = thickness;
	}
	
	// 출력 메서드
	public void print() {
		System.out.println("ShapPencil: 잔여량: "+residual+" 펜굵기: "+thickness);
	}
}
