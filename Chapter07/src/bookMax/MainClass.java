package bookMax;

public class MainClass {

	public static void main(String[] args) {

		Book b = new Book();
				
		BookList bl01 = new BookList();
		bl01.setTitle("자바의 정석");
		bl01.setWrite("남궁성");
		bl01.setPrice(30000);
		b.addBook(bl01);
		
		BookList bl02 = new BookList();
		bl02.setTitle("이펙티브 자바");
		bl02.setWrite("조슈아 블로크");
		bl02.setPrice(36000);
		b.addBook(bl02);
		
		BookList bl03 = new BookList();
		bl03.setTitle("클린 코드");
		bl03.setWrite("로버트 마틴");
		bl03.setPrice(29000);
		b.addBook(bl03);
		
		
		// 출력
		b.print();
		System.out.println();
		System.out.println("=== 가장 비싼 책 ===");
		b.max();
		
	}

}
