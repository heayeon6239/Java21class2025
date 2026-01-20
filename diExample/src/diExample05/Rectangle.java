package diExample05;

public class Rectangle implements ShapeInterface{
	// 멤버 변수
	int h;
	int w;
	
	// 생성자
	public Rectangle(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public String shape() {
		int result = h*w;
		return "Rectangle의 면적 : "+result;
	}



}
