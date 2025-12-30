package ifexample;

import java.util.Random;

public class Randomtest {

	public static void main(String[] args) {
		// ★ Random 클래스는 int 정수형 난수를 발생하는 클래스
		// 숫자값을 입력하지 않으면 int 전체 범위 :-2,147,483,648 ~2,147,483,647 를 난수로 발생
		// import 자동 단축키 : ctrl + shift + O
		Random ra = new Random();
		
		// 1 ~ 10까지의 난수를 발생
		int num = ra.nextInt(10)+1;
		System.out.println("난수 : "+ num);
	}

}
