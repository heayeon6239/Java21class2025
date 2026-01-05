package example;

public class Maintest {
	public static void main(String[] args) {
		
		// 예외처리를 하지 않을 경우 IndexOfBoundException(존재하지 않은 인덱스 사용)에러가 출력됨
		if(args.length != 2) {
			System.out.println("값의 개수가 부족합니다.");
			System.exit(0);
		}
		
		String strNum1 = args[0]; // 10 => "10"
		String strNum2 = args[1]; // 20 => "20"
		
		// 입력받은 args값을 숫자로 변환해야 사칙연산 가능
		// 자바에서 값을 원하는 데이터 형식으로 변환하는 작업을 "파싱"이라고 함
		// 단, 파싱은 반드시 객체 데이터 타입이어야 함 ★ (객체 데이터 타입은 반드시 앞글자가 대문자)
		
		// 정수의 기본타입은 int이지만, 객체 타입은 Integer (다른 말로 래퍼클래스라고 함)
		// Integer.paserInt() => 문자 데이터를 정수형으로 변환
		// "10" -> 10 (정수형 10으로 변환)
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.printf("%d + %d = %d", num1, num2, result);
	}

}
