package inheritance;

public class ChildClass extends ParentClass{
	// 자식 클래스
	int a = 0;
	int b = 20;
	
	// 부모 클래스인 ParentClass를 자식클래스인 ChildClass상속
	// 상속 키워드 : extends
	// 사용 방법 : 자식클래스이름 extends 부모클래스이름
	
	public ChildClass(int a, int b) {
		this.a =a;
		//super(); // 부모의 디폴트 생성자를 호출(생략해도 컴파일러가 자동 생성)
		System.out.println("childClass 생성자");
		//super.setA(b);
		super.a = b;
	}
	
	public void childfun() {
		// this는 ChildClass 자기 자신을 가르킴
		this.a =12;
		// 부모의 멤버변수 a접근하여 값을 25로 변경
		//super.a = 25;
		
		System.out.println("== child start ==");
//		System.out.println("자식의 멤버변수:"+a+", 부모의 a :"+super.a);
	}
}
