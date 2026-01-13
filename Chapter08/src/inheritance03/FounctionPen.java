package inheritance03;

public class FounctionPen extends ShapPencil{
	// 멤버변수
	String color = null;
	
	// 기본 디폴트 생성자
	public FounctionPen() {};
	
	// 매개변수 생성자
	public FounctionPen(String color, int residual, int thickness) {
		this.color = color;
		super.residual = residual;
		super.thickness = thickness;
	}
	
	// 출력 메서드
    public void print() {
    	System.out.print("FounctionPen: 잔여량: "+residual+" 펜굵기: "+thickness+"색상: "+color);
	}
}
