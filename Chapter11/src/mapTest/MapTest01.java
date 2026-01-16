package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {

	public static void main(String[] args) {
		// Map <key, value> : 자바의 collection 의 프레임워크 일종
		// Map 의 특징은 반드시 key(키), value(값)의 쌍으로 구성
		// key(키)는 중복을 허용 X, value(값)은 중복 O
		// Map 은 key(키)를 이용하여 value(값)을 저장하거나, 검색, 삭제할 때 사용하면 유용
		// Map 의 종류 : HashMap, HashTable, TreeMap, Properties ...
		// Map 인터페이스 메서드 : put[키, 값] => 키와 값을 입력하는 메서드
		// Map 은 반드시 import 해야함
		
		// Map<K,V> => < > 은 제네릭
		// Map<K,V> => K 는 반드시 래퍼클래스(String, Integer, Double...)
		//          => 또는 개발한 클래스 예) Member, Product, Cart ...
		
		// HashMap 은 Map 의 하위클래스이므로, 데이터 타입을 부모인 Map 으로 업캐스팅 가능 !!
		Map<String, String> list = new HashMap<>();
		// 생성한 객체의 list 는 -> "참조변수" (값이 들어가는게 아니라, 번지 주소가 들어감) ★★★★★
//		HashMap<String, String> list02 = new HashMap<>();
		
//		Map<String, String> list03 = new Map<>(); // Map 은 인터페이스이므로 객체화 할 수 없음 XX

		// 01. put 메서드 - list.put(key[i], value[i])
		String[] key = {"a","w","b","p","x"};
		String[] value = {"apple","banana","candy","dog","enum"};
		
		for(int i=0; i<key.length; i++) {
			// list(참조변수)에 put()메서드 사용 가능한 이유 : HashMap 객체를 생성하고 데이터 타입은 Map 이기때문에 
			//                                       Map 인터페이스의 메서드(put, get ...)에 모두 접근 가능
			list.put(key[i], value[i]);
		}
		
		// => HashMap 은 입력, 저장 순서가 없음, 해시테이블에 저장됨, 비선형자료구조 !!
		System.out.println(list); // 출력 {p=dog, a=apple, b=candy, w=banana, x=enum} 
		
		// 02. keySet(), value() 메서드 사용 방법
		System.out.println("----------------------");
		System.out.println(list.keySet()); // Key 값 출력 -> [p, a, b, w, x] 
		System.out.println(list.values()); // Value 값 출력 -> [dog, apple, candy, banana, enum]
		
		// 03. get(현재 출력하고싶은 key 값 입력) 메서드
		System.out.println(list.get(key)); // null
		System.out.println(list.get(value)); // null
		System.out.println(list.get(list)); // null
		System.out.println(list.get("p")); // key 값이 "k"에 해당하는 value 값 출력 -> dog
		
		// 04. replace() : 키 값과 변경할 값을 제공하면 해당 키의 값이 변경
		list.replace("a", "code");
		System.out.println(list.get("a")); // apple -> code
		
		// 05. put() 메서드 - list.put(key[i], value[i])
		// (1) 이미 존재하는 같은 key 에 해당하는 value 를 새로운 값으로 덮어씀 (replace()메서드와 비슷함)
		list.put("a", "apple");
		System.out.println(list.get("a")); // code -> apple
		// (2) f, float 추가
		list.put("f", "float");
		System.out.println(list); // {p=dog, a=apple, b=candy, f=float, w=banana, x=enum}
		
		// 06. containKey(), containValue() : key 나 value 의 존재 유무 -> 결과는 true, false
		boolean isCheck;
		isCheck = list.containsKey("z");
		System.out.println(isCheck); // false
		boolean isCheckV;
		isCheckV = list.containsValue("apple");
		System.out.println(isCheckV); // true
		
		// 07. remove(), clear()
		// remove(제공한 키) : 제공한 키 값만 삭제
		list.remove("x");
		System.out.println(list); // {p=dog, a=apple, b=candy, f=float, w=banana}
		// clear() : 전체 삭제
		list.clear();
		System.out.println(list); // {}
		
		System.out.println("-------------------------");
		
		for(int i=0; i<key.length; i++) {
			list.put(key[i], value[i]);
		}
		System.out.println("---- 확장 for문 이용 출력 ----");
		// for(데이터 타입 작명 : 참조변수)
		// key = {"a","w","b","p","x"}
		for(String mList : list.keySet()) {
			System.out.println(mList+": "+list.get(mList));
		}
		
		System.out.println("-------------Iterator() 메서드 --------------");
		// 08. Iterator() 메서드 : collection 또는 Map 에서 사용하는 객체 순회 메서드
		// Set<데이터 타입>
		// key = {"a","w","b","p","x"}0
		Set<String> keyset = list.keySet();
		// iterator() 메서드를 사용하려면 Iterator 클래스를 import 해야함
		// ir = {"a","w","b","p","x"}
		Iterator <String> ir = keyset.iterator(); 
		while(ir.hasNext()) { // 다음 key 가 존재하면 true, 없으면 false
			String k = ir.next();
			String v = list.get(k);
			System.out.println(k+": "+v);
		}

	}

}
