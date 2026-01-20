package diExample03;

public class Main {

	public static void main(String[] args) {
		
		PaymentProcessor pp = new PaymentProcessor();
		pp.payment(10000, new CreditCardPayment());
		pp.payment(10000, new KakaoPayPayment());
		pp.payment(10000, new NaverPayPayment());

	}

}
