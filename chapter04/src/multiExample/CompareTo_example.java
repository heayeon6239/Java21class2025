package multiExample;

public class CompareTo_example {

	public static void main(String[] args) {
		
		// CompareTo()메서드는 String pool과 전혀 상관없는 문자열의 내용만을 비교(숫자는 X)
		// A.compareTo(B) => 결과는 0, 음수, 양수로 출력
		// (A와 B가 같으면 0이 출력)
		// (A가 B보다 사전적으로 순서가 앞이면 음수 출력)
		// (A가 B보다 사전적으로 순서가 뒤이면 양수 출력)
		
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";

		// 유니코드로 가=44032, 나=45208
		int result1 = str1.compareTo(str2);
		System.out.println(result1); // -1176 -> '가'가 '나'보다 사전적으로 앞 -> 음수
		
		int result2 = str2.compareTo(str1);
		System.out.println(result2); // 1176 -> '나'가 '가'보다 사전적으로 뒤 -> 양수
		
		int result3 = str1.compareTo(str3);
		System.out.println(result3); // 0 -> 같음 -> 0ㄴ
		
		if(result3 != 0) {
			System.out.println("같은 문자가 존재하지 않습니다.");
		}else {
			System.out.println("같은 문자입니다."); // 같은 문자입니다.
		}
	}

}
