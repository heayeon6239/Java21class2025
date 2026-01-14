package inheritance04;

public class GoldCustomer extends Customer{
	
	// 디폴트 기본 생성자
	public GoldCustomer() {};
	
	// 매개변수 생성자
	public GoldCustomer(String id, String name) {
		super(id, name);
		super.bonusRatio = 0.02;
		super.grade = "GOLD";
	}
	
	// 고객 정보 출력 메서드
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo(); 
	}
	
}
