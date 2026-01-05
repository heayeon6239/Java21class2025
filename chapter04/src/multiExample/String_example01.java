package multiExample;

import java.util.Scanner;

public class String_example01 {

	public static void main(String[] args) {
		
		// 01. String 객체 데이터 타입은 new로 생성하여 작성하는 경우 Heap메모리에 저장
		//     (== 연산자는 참조타입의 값이 아니라 참조 주소를 비교 ★)
		//     (equals()메서드는 값 또는 내용만 비교)
		String a = new String("hongpossible");
		String b = new String("hongpossible");
		
		// a와 b의 물리적 주소 => 참조 주소
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		if(a==b) {
			System.out.println("a==b");
			// 804564176
			// 1421795058 
			// -> a와 b는 문자의 데이터 값은 같아도 서로 다른 참조 주소이므로 같지 않음
		}
		if(a.equals(b)) {
			System.out.println("a.equals(b) // true");
		}
		
		
		// 02. 문자열 리터럴 이용하여 작성 (String pool에 저장됨 주의)
		//     ★ 같은 문자열 리터럴이 이미 존재하면 새로 만들지 않고 기존 객체를 재사용
		//     참조 주소가 같기 때문에 == 연산자를 이용해 비교해도 true가 출력
		String c = "hong";
		String d = "hong";
		System.out.println(System.identityHashCode(c)); // 1555009629
		System.out.println(System.identityHashCode(d)); // 1555009629 -> Heap주소가 같음
		
		if(c==d) {
			System.out.println("c==d"); // -> 비교 가능
		}
		if(a.equals(d)) {
			System.out.println("a.equals(d) // true");
		}
		
		
		// 03. Scanner의 next()동작 방식은 키보드 입력을 하면 
		//     String pool을 사용 X, 새로운 String 객체를 Heap에 생성
		//     키보드 또는 네트워크를 통해 가지고오는 데이터의 오류는 컴퓨터는 알 수 없음
		//     그러므로 try ~ catch()를 통해 오류 메시지를 전달 -> 이것이 예외처리
		Scanner scan = new Scanner(System.in);
		
		// Scanner로 입력받은 숫자의 예외처리는 try ~ catch()를 이용
		
//		System.out.println("숫자 입력: ");
//		try {
//			int num = scan.nextInt();
//		}catch(Exception e) {
//			System.out.println("숫자를 입력하세요.");
//		}
		
		String name = "홍길동";
		String str = scan.next();
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(str));
		
		if(name == str) {
			System.out.println("==연산자 일치");
		}else {
			System.out.println("==연산자 불일치"); // ==연산자 불일치 (heap주소 불일치)
		}
		
		if(name.equals(str)) {
			System.out.println("equals() 일치"); // equals() 일치 (★ String scan -> equals()사용)
		}else {
			System.out.println("equals() 불일치");
		}
		

	}

}
