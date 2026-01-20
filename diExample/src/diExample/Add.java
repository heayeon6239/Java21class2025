package diExample;

public class Add implements Ical{

	// 단, 추상메서드는 반드시 오버라이드(재정의) 필수
	@Override
	public int doOper(int num01, int num02) {
		int result = num01 + num02;
		return result;
	}
	
//	public Add(int num01, int num02) {
//		int result;
//		result = num01 + num02;
//		System.out.println("＋ : "+result);
//	}
	

}
