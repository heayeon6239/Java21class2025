package shopMol;

import java.util.ArrayList;

public class ItemManager {
	
	// 카테고리를 String 자료형으로 ArrayList생성
	ArrayList<String> category = new ArrayList<String>();
		
	//전체 아이템리스트를  Item 자료형으로 ArrayList생성
	ArrayList<Item> itemList = new ArrayList<Item>();
	
	
	// 기본 디폴트 생성자
	public ItemManager() {
		// 카테고리 추가
		category.add("과자"); // String 은 new 생성할 필요없음
		category.add("육류");
		category.add("생선");
		category.add("음료수");
		
		// 아이템 추가
		itemList.add(new Item("새우깡",1300,category.get(0))); // category 는 String 데이터 타입
		itemList.add(new Item("칸쵸",1500,category.get(0)));
		itemList.add(new Item("고등어",2000,category.get(1)));
		itemList.add(new Item("새우",1800,category.get(1)));
		itemList.add(new Item("소고기",7500,category.get(2)));
		itemList.add(new Item("삼겹살",3000,category.get(2)));
		itemList.add(new Item("콜라",1000,category.get(3)));
		itemList.add(new Item("사이다",900,category.get(3)));
	};
	
	// 카테고리 추가 및 item 추가 메서드
	public void info(String name, int price, String category) {
		int cateIndex = 0;
		for(int i=0; i<this.category.size(); i++) {
			if(category == this.category.get(i)) {
				cateIndex = i; // 입력한 카테고리와 같은 카테고리 인덱스 저장
			}
		}
		itemList.add(new Item(name, price, this.category.get(cateIndex)));
	}
	
	// 카테고리 출력 메서드
	public void printCategory() {
		for(String c : category ) System.out.println(c);
	}
	
	//item 목록 출력 메서드 
	public void printItemList() {
		for(Item i : itemList) i.printInfo();
	}


	
	
}
