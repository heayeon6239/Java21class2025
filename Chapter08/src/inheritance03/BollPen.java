package inheritance03;

public class BollPen extends ShapPencil{
	// 멤버변수
	String color = null;
	
	// 기본 디폴트 생성자
	public BollPen() {};
	
	// 매개변수 생성자
	public BollPen(String color, int residual, int thickness) {
		this.color = color;
		super.residual = residual;
		super.thickness = thickness;
	}
	
	// 출력 메서드
    public void print() {
    	System.out.print("BollPen: 잔여량: "+residual+" 펜굵기: "+thickness+"색상: "+color+"\n");
	}
}
