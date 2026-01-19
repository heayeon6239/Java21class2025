package excepTest;

public class MainClass05 {

	public static void main(String[] args) {
		
		MainClass05 main05 = new MainClass05();
		try {
//			main05.firstMethod();
			main05.thirdMethod();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("예외처리 연습");

	}
	
	// 메서드 생성
	// throws Exception : 예외 던지기
	// 자기 자신이 예외처리를 하는 것이 아니라, 자기 자신을 호출하는 메서드로 예외 처리를 넘김
	// 만약 main()메서드에 throws Exception 으로 예외 던지기를 하면, JVM(자바가상머신)이 알아서 예외 처리를 진행
//	public void firstMethod() throws Exception {secondMethod();}; // 2 -> 1
//	public void secondMethod() throws Exception {thirdMethod();}; // 3 -> 2
	public void thirdMethod() throws Exception { // 3
		System.out.println("(10 / 0) :"+(10/0));
	};

}
