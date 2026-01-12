package bookshop;

import java.util.ArrayList;

public class BookList {
	
	ArrayList<BookDTO> list;

	// 디폴트 생성자
	public BookList() {
		list = new ArrayList<>();
	};
	
	
	// 리스트 출력
	public void printList() {
		for(BookDTO b : list) b.print();
	}
	
	// 추가 메서드
	public void addList(BookDTO DTO) {
		list.add(DTO);
	}
	
	// 총계 메서드
	public int total() {
		int sum = 0;
		for(BookDTO b : list ) {
			sum += b.Price;
		}
		return sum;
	}
}
