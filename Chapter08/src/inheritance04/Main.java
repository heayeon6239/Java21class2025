package inheritance04;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerlist = new ArrayList<>();
		
		// 인스턴스(상속받은 하위클래스는 상위클래스를 데이터 타입으로 인스턴스화 할 수 있다.)
		Customer c = new Customer("lee","이순신");
		Customer c01 = new Customer("sin","신사임당");
		GoldCustomer Gold = new GoldCustomer("Kim","김유신");
		GoldCustomer Gold01 = new GoldCustomer("hong","홍길동");
		VIPcutomer vip = new VIPcutomer("Lee","이율곡");
		
		customerlist.add(c);
		customerlist.add(c01);
		customerlist.add(Gold);
		customerlist.add(Gold01);
		customerlist.add(vip);
		
		DecimalFormat d = new DecimalFormat("#,##0원");
		
		System.out.println("================고객 정보 출력==================");
		
		// 사실상 업캐스팅(부모를 자식의 데이터 타입으로 참조)
		for(int i=0; i<customerlist.size(); i++) {
			System.out.println(customerlist.get(i).showCustomerInfo());
		}
		
//		System.out.println(c.showCustomerInfo());
//		System.out.println(c.showCustomerInfo());
//		System.out.println(Gold.showCustomerInfo());
//		System.out.println(Gold.showCustomerInfo());
//		System.out.println(vip.showCustomerInfo());
		
		System.out.println("================보너스 할인 결과 ==================");
		
		int price = 10000;
		
		for(int i=0; i<customerlist.size(); i++) {
			int money = customerlist.get(i).calcPrice(price);
			System.out.println(customerlist.get(i).name+"님이"+money+"를 지불하셨습니다.");
			System.out.println(customerlist.get(i).showCustomerInfo());
		}
		
//		System.out.print("지불금액은 "+ d.format(c.calcPrice(10000))+"이고, ");
//		System.out.println(c.showCustomerInfo());
//		
//		System.out.print("지불금액은 "+ d.format(c.calcPrice(10000))+"이고, ");
//		System.out.println(c.showCustomerInfo());
//		
//		System.out.print("지불금액은 "+ d.format(Gold.calcPrice(10000))+"이고, ");
//		System.out.println(Gold.showCustomerInfo());
//		
//		System.out.print("지불금액은 "+ d.format(Gold.calcPrice(10000))+"이고, ");
//		System.out.println(Gold.showCustomerInfo());
//		
//		System.out.print("지불금액은 "+ d.format(vip.calcPrice(10000))+"이고, ");
//		System.out.println(vip.showCustomerInfo());
		
		
		
		

	}	

}
