package diExample05;

public class Main {

	public static void main(String[] args) {
		ShapeCalculator sc = new ShapeCalculator();
		sc.shape(new Circle(5));
		sc.shape(new Rectangle(5,6));
		sc.shape(new Triangle(5,7));

	}

}
