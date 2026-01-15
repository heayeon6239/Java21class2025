package interfaceEx03;

public class Circle implements Shape{
	// 멤버변수
	int radius;
	
	public Circle() {
		radius = 10; // 반지름을 초기화
	};

	@Override
	public void draw() {
		System.out.println("반지름이"+radius+"인 원입니다.");
		
	}

	@Override
	public double getArea() {
		double r = (radius * radius)* 3.14;
		return r;
	}

}
