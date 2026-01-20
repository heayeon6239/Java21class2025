package diExample;

public class MainClass {

	public static void main(String[] args) {
		
		MyCal mc = new MyCal();
//		mc.add(20, 10, new Add());
//		mc.sub(20, 10, new Sub());
//		mc.mul(20, 10, new Mul());
//		mc.div(20, 10, new Div());
		mc.all(20, 10, new Add());
		mc.all(20, 10, new Sub());
		mc.all(20, 10, new Mul());
		mc.all(20, 10, new Div());

	}

}
