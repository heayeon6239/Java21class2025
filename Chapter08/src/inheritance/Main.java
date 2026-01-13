package inheritance;

public class Main {

	public static void main(String[] args) {
		// 부모, 자식 클래스 모두 객체화
		ParentClass p = new ParentClass();
		ChildClass c = new ChildClass(1,2);
		// 부모클래스의 기본 생성자는 자식클래스보다 먼저 컴파일러가 불러옴, 없으면 자동 생성
		// 단, 부모의 디폴트 생성자가 존재하지 않는 경우 컴파일러는 자동 생성 X
		c.childfun();
		// c.Parentfun() 메서드로 접근 가능한 이유는 ChildClass가 ParentClass를 상속받았기 때문
		
		// main()메서드에서 자식의 객체를 통해서 변경된 a값을 출력할 수 있고,
		// 부모 객체를 새로 생성해서는 그 변경된 값을 볼 수 없다.
		// 부모 객체를 따로 생성하였기 때문에 a =10이 됨 (ChildClass에서 부모의 a값을 변경했기 때문)
		c.Parentfun(); // 부모 :25,20
		p.Parentfun(); // 부모 :10,20
		
		System.out.println(c.a); // 12
		System.out.println(c.b); // 20
	}

}
