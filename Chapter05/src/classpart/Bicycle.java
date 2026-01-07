package classpart;

// 클래스
public class Bicycle {
	// 멤버변수
	String color;
	int price;
	
	// 디폴트 생성자(★class이름과 동일하게)
	public Bicycle() {
		System.out.println("Bicycle constructor -I");
	};
	
	// 매개변수가 존재하는 생성자
	public Bicycle(String c, int p) {
		System.out.println("Bicycle constructor -II");
		color = c;
		price = p;
	}
	
	// 메서드 함수
	public void showInfo() {
		System.out.println("-- info --");
		System.out.printf("color : %s%nprice : %d%n",color,price);
		System.out.println();
	}
	
	// main 메서드
	public static void main(String[] args) {
		// 인스턴스
		Bicycle bi01 = new Bicycle();
		bi01.showInfo();
		
		Bicycle bi02 = new Bicycle("red",100000);
		bi02.showInfo();
	}
}
