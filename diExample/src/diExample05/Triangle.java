package diExample05;

public class Triangle implements ShapeInterface{
	// 멤버 변수
	int h;
	int w;
	
	// 생성자
	public Triangle(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public String shape() {
		double result = (h*w)/2;
		return "Triangle의 면적 : "+result;
	}

}
