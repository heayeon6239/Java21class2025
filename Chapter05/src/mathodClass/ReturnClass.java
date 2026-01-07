package mathodClass;

public class ReturnClass {
	
	// 메서드 작성 연습 (void -> 값을 반환하지 않겠음)
	public void Returnint() {
		int k = 10;
	}
	
	// 데이터 타입으로 메서드 작성시 반드시 값을 반환
	public String ReturnString() {
		// return이란 값을 호출한 곳으로 반환
		return "자바";
	}
	
	public static void main(String[] args) {
		// 객체화
		ReturnClass rt = new ReturnClass();
		rt.Returnint(); // 값을 반환하지 않았기때문에 출력 X
		String res = rt.ReturnString(); // Return으로 반환한 "자바"를 저장
		System.out.println();
		System.out.println(res);
	}
}
