package arrListEx01;

import java.util.ArrayList;
import java.util.Scanner;

public class CartMainClass {

	public static void main(String[] args) {
		
		CartClass cart = new CartClass();
	
		Scanner scan = new Scanner(System.in);
		
		// 장바구니 생성(list라는 ArrayList에 추가됨)
		cart.add(new ProductClass("사과",1000));
		cart.add(new ProductClass("바나나",2000));
		cart.add(new ProductClass("망고",5000));
		cart.add(new ProductClass("포도",8000));
		cart.add(new ProductClass("수박",10000));
		
		// 장바구니 출력
		cart.arrList();
		System.out.println("총 금액 : "+cart.total());
		
		// 삭제
		System.out.println("삭제할 상품을 입력: ");
		int del = scan.nextInt();
		cart.delete(del);
		// 장바구니 출력
		cart.arrList();
		
		// 추가
		System.out.println("추가할 상품을 입력: ");
		String add = scan.next();
		cart.add(new ProductClass(add,3000));
		
		// 장바구니 출력
		cart.arrList();
	}

}
