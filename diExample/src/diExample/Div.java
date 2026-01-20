package diExample;

public class Div implements Ical{

	@Override
	public int doOper(int num01, int num02) {
		int result = (num02 != 0)? num01 / num02 : 0;
		return result;
	}
	
//	public Div(int num01, int num02) {
//		int result;
//		result = (num02 != 0)? num01 / num02 : 0;
//		System.out.println("÷ : "+result);
//	}
	
}
