package arrListEx01;

import java.util.ArrayList;

import arrayListTest.Member;

// 클래스
public class ProductClass {
	// 멤버 변수
	String fruit;
	int price;
	
	// 디폴트 생성자
	public ProductClass() {};
	
	// 매개변수가 포함된 생성자
	public ProductClass(String fruit, int price) {
		this.fruit = fruit;
		this.price = price;
	}
	
	// 상품 출력 메서드
	public void printList() {
		System.out.printf("%s : %d%n", fruit, price);
	}
	
	
}
