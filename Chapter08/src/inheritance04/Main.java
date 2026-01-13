package inheritance04;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		DecimalFormat d = new DecimalFormat("#,##0원");
		
		Customer c = new Customer("lee","이성계");
		System.out.print("지불금액은 "+ d.format(c.calcPrice(10000))+"이고, ");
		System.out.println(c.showCustomerInfo());
		
		// 상속받은 하위클래스는 상위클래스를 데이터 타입으로 인스턴스화 할 수 있다.
		Customer vip = new VIPcutomer("kim","김길동");
		System.out.print("지불금액은 "+ d.format(vip.calcPrice(10000))+"이고, ");
		System.out.println(vip.showCustomerInfo());

	}

}
