package ifexample;

public class Iftest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		// 01.
		if(num1<num2) {
			System.out.println("num1은 num2보다 작다");
		}
		// 02.
		if(num1<num2) {
			System.out.println("num1은 num2보다 작다");
		}else {
			System.out.println("num1은 num2보다 크거나 같다");
		}
		// 03.
		if(num1<num2) {
			System.out.println("num1은 num2보다 작다");
		}else if(num1>num2) {
			System.out.println("num1은 num2보다 크다");
		}else {
			System.out.println("num1은 num2는 같다");
		}
		
		

	}

}
