package classpart;

public class Person {
	// 전역 멤버변수
	String name;
	float height;
	float weight;
	
	// 생성자 : 객체를 초기화하여 생성해주는 역할
	// 디폴트 생성자가 존재하지 않으면 컴파일러가 자동으로 생성
	// 단, 매개변수 생성자가 존재하고 디폴트 생성자가 존재하지 않을 경우 -> 디폴트 생성자가 컴파일러가 자동으로 생성 X
	// default 생성자
	// 생성자 이름은 반드시 클래스 이름과 같아야함
	// 생성자는 여러개 만들 수 있으나, 똑같은 형식으로 작성 X
	public Person() {} // 기본 생성자
	public Person(String name) {
		// this가 가르키는 곳은 Person클래스의 멤버변수 (멤버변수 name에 생성자의 매개변수 이름을 넣어주라는 의미)
		this.name = name;
	}
	public Person(float height, float weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		// 인스턴스
		// default 생성자를 생성하지 않은채로 아래처럼 기본생성자를 객체화할 수 없음
		// 이유 : 이미 매개변수 생성자가 2개나 존재하므로, 컴파일러가 디폴트 생성자를 자동생성 X
		// 클래스는 반드시 객체화해서 사용해야함을 주의!!!!!
		Person pe = new Person(); // pe는 참조변수, 객체화 = 인스턴스화 ★★★★★
//		Random ra = new Random();
		// Scanner클래스는 디폴트 생성자 존재 X, 
		// 입력받는 inputstream이 키보드인지 네트워크인지 구분이 필요하기 때문
		// -> new scanner(System.in) 매개변수 생성자만 존재
//		Scanner scan = new scanner(); 
		Person pe02 = new Person("홍길동");
		Person pe03 = new Person(178,100);
		
		System.out.println(pe02.name);
		System.out.println(pe03.height);
		System.out.println(pe03.weight);
	}
}
