package staticExample;

public class StaticEx01 {
	// 멤버변수
	static int atm = 0;
	String name;
	int money = 0;
	
	
	// 디폴트 생성자
	public StaticEx01() {};
	
	// 오버로딩 : StaticEx01의 기본 생성자를 재정의하여 사용
	//         반드시 재정의된 매개변수가 존재하는 생성자의 매개변수를 입력해야함
	public StaticEx01(String name) {
		this.name =  name;
	}
	
	// 입금 메서드
	public void plus(int money) {
		atm += money;
//		System.out.println("atm :"+atm);
	}
	
	// 출금 메서드
	public void minus(int money) {
		atm -= money;
//		System.out.println("atm :"+atm);
	}
	
	// 출력 메서드
	public void print() {
		System.out.println("name : "+this.name);
		System.out.println("atm : "+atm);
	}
}
