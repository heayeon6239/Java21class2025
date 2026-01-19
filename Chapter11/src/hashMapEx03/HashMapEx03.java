package hashMapEx03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String,Float> scores = new HashMap<>();

		System.out.println("미래 장학금 관리 시스템 입니다.");
		
		// for 문으로 예외처리를 할 경우 조건에 해당하면 거기에 i++을 넣는 것도 가능!!
		while(scores.size() < 5) {
			System.out.println("이름과 학점>>");
			String input = scan.nextLine();
			
			StringTokenizer st = new StringTokenizer(input);
			String name = st.nextToken();
			float score = Float.parseFloat(st.nextToken());
			
			scores.put(name,score);
		}
		System.out.println("장학생 선발 학생 기준 입력 >>");
		float basis = scan.nextFloat();
		
		System.out.print("장학생 명단:");
		ArrayList<String> nameArr = new ArrayList<>();
		
		for(String n : scores.keySet()) {
			if(scores.get(n) > basis) {
				nameArr.add(n);
			}
		}
		System.out.print(nameArr);

	}

}
