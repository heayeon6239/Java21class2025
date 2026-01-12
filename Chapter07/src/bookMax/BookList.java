package bookMax;

import java.text.DecimalFormat;

public class BookList {
	// 멤버변수
	private String title;
	private String write;
	private int price;
	int maxPrice = 0;
	
	// 디폴트 생성자
	public BookList() {}

	// getter(), setter()
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWrite() {
		return write;
	}

	public void setWrite(String write) {
		this.write = write;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	};
	
	DecimalFormat p = new DecimalFormat("#,###원");
	// 출력 메서드
	public void listPrint() {
		System.out.println("제목: "+title+"\t"+"저자: "+write+"\t"+"가격: "+p.format(price));
	}
	
	
	
	
	
}
