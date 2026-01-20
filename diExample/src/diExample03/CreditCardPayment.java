package diExample03;

public class CreditCardPayment implements PayInterface{

	@Override
	public String pay(int money) {
		return "신용카드로"+money+"원 결제 완료";
	}

}
