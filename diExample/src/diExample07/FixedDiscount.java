package diExample07;

public class FixedDiscount implements DiscountInterface{
	// 멤버 변수
	int discount;
	int price;
	
	// 생성자
	public FixedDiscount(int price, int discount) {
		this.discount = discount;
		this.price = price;
	}

	@Override
	public String disInter() {
		int result = price - discount;
		return "원가: "+price+", 할인가: "+result;
	}

}
