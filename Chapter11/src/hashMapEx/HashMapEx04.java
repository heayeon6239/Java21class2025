package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashMap<String,Integer> points = new HashMap<>();
		boolean run = true;
		
		System.out.println("** 포인트 관리 프로그램입니다. **");
		
		while(run) {
			System.out.print("\n이름과 포인트 입력 >>");
			String input = scan.nextLine();
			
			// 종료
			if(input.equals("그만")) {
				run = false;
				System.out.println("종료");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(input);
			String name = st.nextToken();
			Integer point = Integer.parseInt(st.nextToken().trim());
			
			// HashMap<>에 추가
			if(points.containsKey(name)) { // 이름이 이미 존재하면
//				int ns = point + points.get(name);
				point += points.get(name);
			}
			
			// 새로 들어온 point 값이든, 누적된 수정 point 값이든 최종 값 삽입
			points.put(name, point);
			
			// 내역 출력
			for(String n : points.keySet()) {
				System.out.print("("+n+","+points.get(n)+")");
			}
			
		}

	}

}
