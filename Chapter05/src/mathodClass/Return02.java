package mathodClass;

public class Return02 {
	// 배열로된 데이터 타입을 매개변수로 사용하는 함수 작성
	public int test(int[] arr) {
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt ++;
			}
		}
		// cnt : 4의 배수의 개수
		return cnt;
	}
	
	public static void main(String[] args) {
		// 항상 객체화(인스턴스)먼저
		Return02 r = new Return02();
//		r.test(10); // 매개변수로 int값을 적었기 때문에 오류!
		int[] arr= {10,13,14,56,70,100};
		r.test(arr);
		System.out.println(r.test(arr));
		
	}
}
