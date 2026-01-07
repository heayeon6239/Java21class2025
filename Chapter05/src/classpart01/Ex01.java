package classpart01;

// 클래스
public class Ex01 {
	
	// 멤버변수는 배열도 작성 가능 
	// 클래스는 데이터, 기능만 작성
	// main()메서드는 출력만 
	int[] arr = {87, 100, 11, 72, 92};
	
	// 디폴트 생성자 
	public Ex01() {};
	
	// 메서드(기능) 함수
	int sum = 0;
	public void total() {
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		// 인스턴스
		Ex01 e = new Ex01();
		e.total();
//		int sum = 0;
//		for(int i=0; i<e.arr.length; i++) {
//			sum += e.arr[i];
//		}
		
		
	}
	
}
