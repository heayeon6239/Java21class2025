package example;

public class Arrtest02 {

	public static void main(String[] args) {
		
		// 4바이트 * 5개의 방을 만들고, 3개만 초기값을 주었을 때
		int size = 0; // 유효한 값의 개수를 세어 담을 변수
		double[] data = new double[5];
		data[0]=10.0;size++;
		data[1]=20.0;size++;
		data[2]=30.0;size++;
		// 이렇게 배열을 선언해도됨
//		double[] data = {10.0, 20.0, 30.0, 0.0, 0.0};
		
		int total = 1;
		// data.length가 5이고, 초기값은 인덱스 0,1,2만 지정 나머지는 0.0이므로 => total = 0;
		for(int i=0; i<size; i++) {
			total*= data[i];
		}
		System.out.println(total);
	}

}
