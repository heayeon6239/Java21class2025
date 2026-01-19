package excepTest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		// Exception 및 하위 클래스를 이용해서 예외 처리를 다양하게 할 수 있음
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int[] arr = new int[5]; // 자료구조 => 선형자료구조(자료를 선형태로 저장)
		List<Integer> list = new ArrayList<>(); // 업캐스팅(List<> 컬랙션 안에 ArrayList<> 존재)
		
		// try{}catch(){}catch(){}...finally(){}
		try {
			// 실행구문
			System.out.println("input i:");
			i = scan.nextInt();
			System.out.println("input j:");
			j = scan.nextInt();
			System.out.println("(i/j) :"+(i/j));
			
			for(int k=0; k<6; k++) {
				System.out.println("arr["+k+"]"+arr[k]);
			}
			
			System.out.println("List size :"+list.size());
			
		}catch(InputMismatchException e) { // e => 접근을 하기 위한 변수
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//			System.out.println(e.getMessage()); // Index 5 out of bounds for length 5
//			e.printStackTrace(); // + 빨간 오류	
//			System.out.println("배열의 길이 오류");
		}catch(Exception e) { 
			// Exception 최상위 클래스로 catch()가 하나일 때는 사용가능
			// 단, catch()구문이 여러개일 때 Exception 맨 앞에 catch()는 사용불가
//			e.printStackTrace();
			System.out.println("숫자를 입력하세요.");
		}finally { // 오류의 존재 유무와 상관없이 무조건 출력
			System.out.println("end");
		}
	}

}
