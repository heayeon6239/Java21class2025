package interfaceEx03;

import javax.swing.text.NumberFormatter;

public class Main {

	public static void main(String[] args) {
		
		Shape c = new Circle();
		c.redraw(); 
		System.out.println("면적은 "+ c.getArea());

	}

}
