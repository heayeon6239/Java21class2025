package interfaceEx03;

public interface Shape {
	void draw();
	double getArea();
	// 구현
	default void redraw() {
		System.out.println("--- 다시 그립니다.");
		draw();
	}
}
