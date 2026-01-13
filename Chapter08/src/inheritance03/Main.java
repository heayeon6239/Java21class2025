package inheritance03;

public class Main {

	public static void main(String[] args) {

		ShapPencil sp = new ShapPencil(10,1);
		BollPen b = new BollPen("black",25,2);
		FounctionPen f = new FounctionPen("blue",15,2);
		
		sp.print();
		b.print();
		f.print();
	}

}
