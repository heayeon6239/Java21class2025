package otShop;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager extends Item{
	Scanner scan = new Scanner(System.in);
	// 카테고리는 String 데이터 타입으로 ArrayList<> 생성할 것
	ArrayList<String> category = new ArrayList<>(); 
	// 전체 아이템리스트를 Item 자료형으로 ArrayList<> 생성할 것
	ArrayList<Item> itemList = new ArrayList<>(); 
	// 전체 장바구니 => Cart 클래스를 자료형으로 ArrayList<>생성
	ArrayList<Cart> jangList = new ArrayList<>();
	
	// 객체화(=인스턴스화)
	UserMenu user = new UserMenu();
	
	// 기본 디폴트 생성자
	public ItemManager() {info();}; // 실행될 때 가장 먼저 실행되는 생성자!
	
	// itemList에 item을 추가하는 메서드 => ArrayList<>에서 추가하는 메서드 add()
	public void addItem(String name, int price, String category) {
		itemList.add(new Item(name, price, category));
	}
	
	// 카테고리, itemList 추가 메서드
	public void info() {
		category.add("과자"); // index 0
		category.add("생선"); // index 1
		category.add("육류"); // index 2
		category.add("음료수"); // index 3
		addItem("새우깡",1000,category.get(0));
		addItem("고등어",2000,category.get(1));
		addItem("칸쵸",3600,category.get(0));
		addItem("소고기",6500,category.get(2));
		addItem("돼지고기",5500,category.get(2));
		addItem("콜라",1000,category.get(3));
		addItem("사이다",1500,category.get(3));
		addItem("새우",1800,category.get(1));
	}
	
	// 카테고리 출력 메서드
	public void printCategory() {
		for(int i=0; i<category.size(); i++) {
			System.out.println("["+i+"]"+category.get(i));
		}
	}
	
	// 아이템 목록 출력 메서드
	public void printItem() {
		for(int i=0; i<itemList.size(); i++) {
			System.out.print("["+i+"]");
			itemList.get(i).printInfo();
		}
	}
	
	// --------------------- 장바구니 -------------------------
	// usId => id, caId => 카테고리 인덱스 번호, itemId => item 인덱스 번호
	public void addCart(String usId, int CaId, int itemId) {
		// 이미 장바구니에 아이템이 존재하는지 검사(이미 존재하면 수량 누적, 가격 누적 필요)
		// Cart 인스턴스화
		Cart temp = new Cart(); // temp : 임시 기억 장소
		int cnt = 0; // 개수(지역변수이기때문에 0으로 자동 초기화)
		int jangcnt = 0; // 장바구니에 중복된 데이터의 존재 유무 치트키
		int log = user.logindex; // UserMenu 클래스의 로그인된 log 값을 static 으로 공유
		temp.userId = usId;
		
		for(int i=0; i<itemList.size(); i++) {
			// 예외처리(1~8 말고 다른 번호가 들어오면 false)
			if(itemList.get(itemId).name.equals(itemList.get(i).name)) { 
				// 이미 장바구니에 상품이 존재 O
				jangcnt = 0;
				for(int j=0; j<jangList.size(); j++) {
					// 비교 => 현재 장바구니에 담긴 아이템 이름과 아이템 리스트 이름이 같은지 
					if(jangList.get(j).itemName.equals(itemList.get(i).name) && jangList.get(j).userId.equals(user.id[log])) {
						// 가격 누적, 수량 1씩 누적
						jangList.get(j).price += itemList.get(i).price;
						jangList.get(j).quantity ++;
						jangcnt += 1;
					}
				}
				// 이미 장바구니에 상품이 존재 X
				if(jangcnt == 0) {
					temp.itemName = itemList.get(i).name;
					temp.price = itemList.get(i).price;
					cnt += 1;
					temp.quantity = cnt;
					// 장바구니 추가
					jangList.add(temp);
				}
			}
		}
		
	}
	
	// 장바구니 출력 메서드(관리자용 전체 user의 장바구니 출력)
	public void printJang() {
		for(int i=0; i<jangList.size(); i++) {
			jangList.get(i).printCart();
		}
	}
	
	// 전체 item 메서드 추가
	public void addItem02(String addName, int addPrice, int addCategory) {
		// Item 클래스 추가
		Item temp = new Item(addName, addPrice, category.get(addCategory));
		itemList.add(temp);
		
	}
	
	// 전체 item 삭제 메서드
	public void delItem(int delIndex) {
		itemList.remove(delIndex);
	}
	
	// 전체 item 수정 메서드
	public void update(int indexNum, String upName, int upPrice) {
		itemList.get(indexNum).name = upName;
		itemList.get(indexNum).price = upPrice;
	}
}
