package inheritance02;

public class IPTV extends ColorTV{
	// 멤버변수
	String iptv = null;
	
	public IPTV(String iptv, int size, int color) {
		this.iptv = iptv;
		super.color = color;
		super.size = size;
	}
	
	// 출력 메서드
	@Override // @ 어노테이션 , Override => "재정의하다"라는 뜻
	public void printProperty() {
		System.out.print("나의 IPTV는"+iptv+" 주소의 ");
		// IPTV의 출력문 메서드(자식)가 ColorTV의 출력문 메서드(부모)를 오버라이드함
		super.printProperty(); // 메서드 이름은 printProperty()로 똑같은데 출력문이 다르기 때문에 Override
	}
}
