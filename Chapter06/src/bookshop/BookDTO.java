package bookshop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookDTO {
	
		// 멤버 변수
		String Booktitle;
		String Author;
		String publisher;
//		String date;
		Date date;
		int Price;
		
		SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd(E)");
		
		// 디폴트 생성자
		public BookDTO() {};
		
		// 매개변수 생성자
		public BookDTO(String Booktitle,String Author,String publisher, Date date,int Price) {
			this.Booktitle = Booktitle;
			this.Author = Author;
			this.publisher = publisher;
			this.date = date;
			this.Price = Price;
		}
		
		// 출력 메서드
		public void print() {
//			System.out.printf("%s\t%s\t%s\t%d\t%d원",Booktitle,Author,publisher,date,Price);
//			System.out.println();
		}
		
}
