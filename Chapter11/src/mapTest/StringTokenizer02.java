package mapTest;

import java.util.StringTokenizer;

public class StringTokenizer02 {

	public static void main(String[] args) {
		
		// StringTokenizer 클래스는 문자와 문자 사이의 구분자를 기준으로 문자를 분리하는 클래스
		String str1 = "Java android";
		String str2 = "Java!android";
		String str3 = "Java!android-fun";
		
		// StringTokenizer 도 객체이므로 반드시 import 해야함
		
		// 01. 공백 기준
		StringTokenizer st1 = new StringTokenizer(str1);
		System.out.println(st1.nextToken()); // Java
		System.out.println(st1.nextToken()); // android
		
		System.out.println("----------");
		
		// 02. 특정 문자 기준
		StringTokenizer st2 = new StringTokenizer(str2,"!");
		for(int i=0; i<2; i++) {
			System.out.println(st2.nextToken());
		}
		System.out.println("----------");
		
		// 03. 특정 문자 2개 기준
		StringTokenizer st3 = new StringTokenizer(str3,"!-");
		for(int i=0; i<3; i++) {
			System.out.println(st3.nextToken());
		}
		System.out.println("----------");
		
		// 04. 특정 문자 추가
		StringTokenizer st4 = new StringTokenizer(str2,"!", true);
		for(int i=0; i<3; i++) {
			System.out.println(st4.nextToken());
		}
		System.out.println("----------");

	}

}
