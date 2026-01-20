package diExample03;

public class KakaoPayPayment implements PayInterface{

	@Override
	public String pay(int money) {
		return "카카오페이로"+money+"원 결제 완료";
	}

}
