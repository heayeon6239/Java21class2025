package queueInterface;

import java.util.ArrayList;

public class Shelf {
	
	// 멤버 변수
	protected ArrayList<String> shelf;
	
	// 생성자
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	// getter(데이터 타입이 protected 인 shelf 를 출력시키는 메서드)
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	// 문자 개수 출력하는 메서드
	public int getCount() {
		return shelf.size();
	}

}
