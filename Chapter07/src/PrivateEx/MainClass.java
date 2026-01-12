package PrivateEx;

public class MainClass {

	public static void main(String[] args) {
		
		PrivateTest pt = new PrivateTest();
//		pt.day = 10;
//		pt.month = 20;
//		pt.year = 2005;
		
		// 먼저 setter()로 값을 수정
		pt.setMonth(2);
		pt.setDay(15);
		pt.setYear(2026);
		
		// 아니면 수정은 불가능하고, 출력은 가능 getter()
//		System.out.println(pt.getDay());
//		System.out.println(pt.getMonth());
//		System.out.println(pt.getYear());

	}

}
