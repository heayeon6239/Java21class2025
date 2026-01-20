package diExample05;

public class Circle implements ShapeInterface{
	// 멤버변수
	final double p = 3.14;
	int radius;
	
	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void print() {
		System.out.print("반지름은?"+radius);
	}
	
	@Override
	public String shape() {
		print();
		double result = radius*p;
		return "원의 면적 : "+result;
	}
	
}
