package arrListEx01;

import java.util.ArrayList;

public class CartClass {
	
	// 디폴트 생성자
	public CartClass() {};
	
	// 현재 작성한 Product클래스는 데이터 타입
	// 상품 배열 생성
	ArrayList<ProductClass> list = new ArrayList<>();
	
	// 상품 목록
	public void arrList() {
		for(ProductClass p : list) p.printList();
	}
	
	// 삭제 메서드
	public int delete(int del) {
		list.remove(del-1);
		return del;
	}
	
	// 추가 메서드
	// 매개변수 Product P의미 => 현재 Product클래스의 멤버 변수, 생성자, 메서드를 p로 접근 가능 (p.fruit, p.printList...)
	public void add(ProductClass p) {
		list.add(p);
	}
	
	// 총계 구하는 메서드
	public int total() {
		int sum = 0;
		for(ProductClass p : list) {
			sum += p.price;
		}
		return sum;
	}
	
}
