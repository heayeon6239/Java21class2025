package diExample07;

public class PercentDiscount implements DiscountInterface {
	// 멤버 변수
	int discount;
	int price;
	
	// 생성자
	public PercentDiscount(int price, int discount) {
		this.discount = discount;
		this.price = price;
	}

	@Override
	public String disInter() {
		int result = (int) (price - (price * (discount*0.01)));
		return "원가: "+price+", 할인가: "+result;
	}
}
