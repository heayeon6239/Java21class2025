package shopMol;

import java.util.ArrayList;

public class Cart{
	
	// 기본 디폴트 생성자
	public Cart() {};
	
	// 장바구니 배열 생성
	ArrayList<CartItem> cartList = new ArrayList<>();
	
	// 장바구니 배열 추가 메서드
	public void addCart(String logID, Item item) {
		
		cartList.add(new CartItem(logID, item));
		
	}
	
	// 전체 장바구니 출력
	public void printAllCart() {
		for(CartItem c : cartList) c.printCart();
	}
	
	// 개인 장바구니 출력
	public void printOneCart(String ID) {
		for(CartItem c : cartList) {
			if(c.logID == ID) {
				c.printCart();
			}
		}
	}
	
}
