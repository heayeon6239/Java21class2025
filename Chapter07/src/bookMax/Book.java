package bookMax;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Book {
	
	int maxPrice = 0;
	int count = 0;
	
	// 디폴트 생성자
	public Book() {};
	
	// 배열 생성
	ArrayList<BookList> list = new ArrayList<>();
	
	// 추가 메서드
	public void addBook(BookList b) {
		list.add(b);
	}
	
	// 출력 메서드
	public void print() {
		System.out.println("=== 전체 책 목록 ===");
		for(BookList b : list) b.listPrint();
	}
	
	DecimalFormat p = new DecimalFormat("#,###원");
	// 최대값 메서드
	public void max() {
		
		for(BookList b : list) {
			if(b.getPrice() > maxPrice) {
				maxPrice = b.getPrice();
				count ++;
			}
		}
		System.out.println("제목: "+list.get(count-1).getTitle()+"\t"+"저자: "+list.get(count-1).getWrite()+"\t"+"가격: "+p.format(list.get(count-1).getPrice()));
	}
}
