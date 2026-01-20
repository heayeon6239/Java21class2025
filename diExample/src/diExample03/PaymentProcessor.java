package diExample03;

public class PaymentProcessor {

	public void payment(int money, PayInterface pay) {
		// DI
		String msg = pay.pay(money);
		System.out.println(msg);
	}

}
