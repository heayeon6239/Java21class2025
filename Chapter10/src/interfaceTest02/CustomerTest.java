package interfaceTest02;

public class CustomerTest {

	public static void main(String[] args) {
		
		// 업캐스팅
		Customer cust = new Customer();
		Buy buy = cust;
		Sell sell = cust;
		
		buy.buy();
		sell.sell();
		
		cust.order(); // 고객의 판매 주문
		buy.order(); // 구매주문 -> 고객의 판매 주문 로 재정의됨 !!
		sell.order(); // 판매주문 -> 고객의 판매 주문

	}

}
