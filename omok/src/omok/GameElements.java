package omok;

public class GameElements {
	
	// 오목 배열 생성
	String[][] arr = new String[13][13];
		
	// 기본 디폴트 생성자 
	public GameElements() {};
	
	// 오목 칸 만들기
	public void omokBase() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = " - ";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
