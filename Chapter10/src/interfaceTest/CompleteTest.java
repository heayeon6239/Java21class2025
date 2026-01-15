package interfaceTest;

public class CompleteTest {

	public static void main(String[] args) {
		// 인터페이스는 인스턴스화 X (단, 업캐스팅은 가능)
		int num1 = 10;
		int num2 = 0;
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2)); // -99999 에러
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		// 이런 경우엔 업캐스팅이 아니라 그냥 인스턴스하는게 맞음
		CompleteCalc comp = new CompleteCalc(); // showInfo() 는 CompleteCalc 클래스만 있기때문에
		comp.showInfo();
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		// static 은 상속 X, 그러므로 하위 클래스에서 접근 불가
		int sum = Calc.total(arr); // Calc 인터페이스로 직접 접근만 가능한 상태
		System.out.println(sum);

	}

}
