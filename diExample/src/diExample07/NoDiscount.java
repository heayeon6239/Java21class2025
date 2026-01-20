package diExample07;

public class NoDiscount implements DiscountInterface{
	// 멤버 변수
	int price;
	
	// 생성자
	public NoDiscount(int price) {
		this.price = price;
	}

	@Override
	public String disInter() {
		// TODO Auto-generated method stub
		return "원가: "+price;
	}
	
}
