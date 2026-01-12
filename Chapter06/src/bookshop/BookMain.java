package bookshop;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookMain {

	public static void main(String[] args) throws ParseException {
		
		BookList bl = new BookList();

		SimpleDateFormat date2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd(E)");
		Date now = new Date();
		DecimalFormat p = new DecimalFormat("\u00A4#,##0원");
		
		System.out.println("==============================================================");
		System.out.println("도서명\t저자\t출판사\t\t출판일\t\t가격");
		System.out.println("==============================================================");
		// 데이터 삽입
		bl.addList(new BookDTO("Java","홍길동","코리아출판사",date2.parse("2025-01-12"),35000));
		bl.addList(new BookDTO("React","김길동","코리아출판사",date2.parse("2025-02-12"),45000));
		bl.addList(new BookDTO("Spring","최길동","코리아출판사",date2.parse("2020-03-12"),15000));
		bl.addList(new BookDTO("HTML","박길동","코리아출판사",date2.parse("2023-01-12"),75000));
		bl.addList(new BookDTO("MySQL","오길동","코리아출판사",date2.parse("2021-04-12"),25000));
		
		for(BookDTO b : bl.list) {
//			String formattedDate = date1.format(date2.parse(b.date));
			// ★ .format : 날짜 -> (내가 원하는 형식의)문자열
			// ★ .parse  : 문자열 -> 날짜
			System.out.printf("%s\t%s\t%s\t%s\t%s",b.Booktitle,b.Author,b.publisher,date1.format(b.date),p.format(b.Price));
			System.out.println();
		}
		
		System.out.println("==============================================================");
		System.out.println("합계: "+p.format(bl.total()));
		

	}

}
