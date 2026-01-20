package diExample03;

public class NaverPayPayment implements PayInterface{

	@Override
	public String pay(int money) {
		return "네이버 페이로"+money+"원 결제 완료";
	}

}
