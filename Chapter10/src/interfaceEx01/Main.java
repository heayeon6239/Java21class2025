package interfaceEx01;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		DecimalFormat d = new DecimalFormat("#,##0원");
		
		Buyable b = new Television("MV-2020","TV-samsung", 509000);
		
		System.out.println("--- 텔레비전 정보 ---");
		System.out.println("메이커: "+ b.getName());
		System.out.println("모델명: "+ b.getModel());
		System.out.println("금액: "+ d.format(b.getPrice()));
		
		Refrigerator r = new Refrigerator("1등급","MV-2020", 2000000);
		
		System.out.println("--- 텔레비전 정보 ---");
		System.out.println("효율성 등급: "+ r.denggub);
		System.out.println("모델명: "+ r.model);
		System.out.println("금액: "+ d.format(r.price));
		
//		Buyable[] by = {b,r};
//		for(int i=0; i<by.length; i++) {
//			System.out.println(by[i].getMaker());
//			System.out.println(by[i].getModel());
//			System.out.println(by[i].getPrice());
//		}
		
	}

}
