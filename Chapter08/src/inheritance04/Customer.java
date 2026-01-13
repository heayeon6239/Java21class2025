package inheritance04;

public class Customer {
	// 멤버변수
	String customerID = null;
	String name = null;
	String grade = null;
	int bonusPoint = 0;
	double bonusRatio;
	
	// 기본 디폴트 생성자
	public Customer() {
		this.bonusRatio = 0.01;
		this.grade = "SILVER";
	};
	
	// 매개변수 생성자
	public Customer(String id, String name) {
		customerID = id;
		this.name = name;
		this.bonusRatio = 0.01;
		this.grade = "SILVER";
	}
	
	// 지불 금액 메서드
	public int calcPrice(int price) {
		// 명시적형변환 ★★★★★ (데이터 타입 변환)
		bonusPoint += (int)(price*bonusRatio);
		int Price = price;
		if(grade == "VIP") {
			Price = price-(price/10);
		}
		return Price;
	}
	
	// 고객 정보 출력 메서드
//	public void showCustomerInfo() {
//		System.out.println(name+"님의 등급은 "+grade+"이며, 보너스포인트는"+bonusPoint+"입니다."+"\n");
//	}
	public String showCustomerInfo() {
		return name+"님의 등급은" + grade+"이며, 보너스 포인트는 "+ bonusPoint+"입니다.";
	}
}
