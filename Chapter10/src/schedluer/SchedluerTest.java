package schedluer;

import java.util.Scanner;

public class SchedluerTest {

	public static void main(String[] args) {
		// Scanner 입력 L, P, R
		Scanner scan = new Scanner(System.in);
		System.out.print("전화 상담 배분 방식을 선택하세요 : R, L, P");
		
		// R또는 r, P또는 p, L또는 l
		String ch = scan.next();
		
		Schedluer sch = null; // 업캐스팅
		
		if("R".equals(ch) ||"r".equals(ch)) {
			// RoundRobin 인스턴스
			sch = new RoundRobin();
		}else if("P".equals(ch) ||"p".equals(ch)) {
			// PriorityAllLocation 인스턴스
			sch = new PriorityAllLocation();
		}else if("L".equals(ch) ||"l".equals(ch)) {
			// LeastJob 인스턴스
			sch = new LeastJob();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		// 메서드 출력
		sch.getNextCall();
		sch.sendCallToAgent();
		sch.getLunch(); // 구현체를 쓴 LeastJob 클래스만 출력됨

	}

}
