package arrayListTest;

import java.util.ArrayList;

public class ArrList01 {

	public static void main(String[] args) {
		
		// ArrayList<E> 참조변수 = new ArrayList<>();
		// <E>부분을 제네릭(Generic)이라 부르며, 반드시 데이터 타입이 클래스로 작성되어야함 ★ (<int> X)
		// ArrayList<>는 가변길이 클래스 배열 (데이터가 삭제, 추가되면 자동으로 크기(배열의 길이)가 작아지거나 커짐)
		
		// 01. ArrayList<>에서 데이터 추가 메서드 -> add(인덱스번호,값), add(값)
		//     단, add(값)은 항상 맨 마지막 위치에 추가
		//     단, add(인덱스번호,값)은 인덱스번호 위치에 값이 추가됨, 이 경우 뒤의 모든 데이터가 밀림
		// 02. ArrayList<>에서 데이터 삭제 메서드 -> remove(인덱스번호)
		//     단, 삭제시 뒤의 데이터들은 앞으로 이동
		// 03. ArrayList<>에서 데이터를 추출하는 메서드 -> get(인덱스번호)
		// 04. ArrayList<>에서 배열의 길이를 추출하는 메서드 -> size()
		// 05. ArrayList<>에서 요소가 비어있는 확인하는 메서드 -> isEmpty()
		//    isEmpty()는 비어있으면 true, 아니면 false를 반환
		
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		// ArrayList<E>의 <E>부분에 데이터 타입이 클래스이어야하므로, 기본데이터 타입인 int를 사용할 수 없음
		// 그러므로 정수형 클래스 데이터 타입인 Integer(래퍼클래스) 입력!!
		ArrayList<Integer> num = new ArrayList<>();
		num.add(20);
		num.add(30);
		for(Integer Number : num) System.out.println(Number);
		
		// 01. 데이터 추가
		list.add("사과");
		list.add("바나나");
		list.add(1, "딸기");
		list.add(1, "포도");
		
		list2.add("시금치");
		list2.add("콩나물");
		// list2의 요소를 list로 통째로 추가 -> addAll()
		list.addAll(list2);
		
		// 02. 데이터 삭제
		list.remove(4); // 시금치 삭제
		
//		System.out.println(list.isEmpty());
		
		// 전체 출력
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// 확장 for문 이용해서 출력(for(자료형 변수이름 : 참조변수){ 실행문; }) 인덱스 사용X
//		for(String li : list) System.out.println(li);
		
// ----------------------------------------------------------------------------------------------
		
		// 내가 만든 클래스를 ArrayList<>의 데이터 타입으로 사용
		ArrayList<Member> meminfo = new ArrayList<>(); // 객체화
//		meminfo.add("홍길동","서울",20);
		meminfo.add(new Member("홍길동","서울",20));
		
		for(Member m : meminfo) m.PrintMember();
	}

}
