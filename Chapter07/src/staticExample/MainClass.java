package staticExample;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		StaticEx01 park = new StaticEx01("박찬호");
		
		park.plus(100);
		park.print();
		System.out.println(park.atm);
		
		System.out.println("-------------------------");
		
		StaticEx01 lee = new StaticEx01("이승협");
		
		lee.plus(200);
		lee.print();
		lee.minus(100);
		System.out.println(lee.atm);
	}

}
