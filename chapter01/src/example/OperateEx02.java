package example;

public class OperateEx02 {

	public static void main(String[] args) {
		int money = 178600;
		
		boolean result = (money - (5000 * (money / 5000))) / 1000 >= 3;
		System.out.println(result);
	}

}
