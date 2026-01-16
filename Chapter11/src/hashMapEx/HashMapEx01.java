package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> nations = new HashMap<>();
		
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: korea 5000)");
		
		while(run) {
			System.out.print("나라 이름, 인구 >>");
			// nextLine() 문장으로 스캔받기, nextInt() 단어로 스캔받기
			String np = scan.nextLine(); 
			// 그만
			if(np.equals("그만")) {
				run = false;
				
				System.out.println("인구 검색 종료");
				int count = 0;
				
				while(count < nations.size()) {
					System.out.println("인구 검색 >>");
					String find = scan.next();
					if(nations.containsKey(find)) {
						System.out.println(nations.get(find));
						count ++;
					}else {
						System.out.println(nations.get(find)+"나라는 확인할 수 없습니다.");
					}
					
				}
				
			}
			// 계속
			else {
				// 나라, 인구 문자 분리(공백 기준)
				StringTokenizer st = new StringTokenizer(np);
				String nation = st.nextToken(); // 나라 이름
				String population = st.nextToken().trim(); // 인구
				
				// 파싱은 반드시 클래스이어야만 함, 래퍼클래스로 진행
				Integer populations = Integer.parseInt(population);	
				// put
				nations.put(nation,populations);
			}
				
		}
	}
}
