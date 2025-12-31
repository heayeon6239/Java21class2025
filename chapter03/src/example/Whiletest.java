package example;

public class Whiletest {

	public static void main(String[] args) {
		
		// while(조건)문은 괄호안의 조건을 만족(true)할때까지 루프(반복)를 돌림
		// 조건이 false가 되면 루프를 빠져나옴
		
		int num = 1; // 조건을 만족하기 위한 1씩 누적하는 변수
		int sum = 0; // 총합계를 구하기 위한 변수
		
// 		01. 1 ~ 10 까지의 값을 더한값을 출력
//		while(num <= 10) {
//			sum += num;
//			// num값을 누적하지 않으면 무한루프 발생(num값이 변하지 않는데 10미만이기 때문에)
//			num ++; // num = num+1 => num = 2 
//			System.out.printf("sum:%d, num:%d%n",sum,num);
//		}
		
// 		02. break를 쓰지 않으면 항상 true이기 때문에 무한루프
//		while(true) {
//			sum += num;
//			num ++;
//			break; // 루프를 빠져나옴
//		}
//		System.out.println(sum); // 1
//		System.out.println(num); // 2
		
		// 문제01) 10 ~ 1 까지 반복해서 6 ~ 3까지 거꾸로 출력
		// 정답 ) 6,5,4,3
		// while, if문 사용
		
		int num02 = 10;
		while(num02 >= 1) {
			if(num02 <= 6 && num02 >= 3) {
				System.out.println(num02+"");
			}
			num02 --; // num02의 수가 감소되어야함
		}
	}

}
