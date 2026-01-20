package diExample02;

public class Main {

	public static void main(String[] args) {
		
		GreetingService g = new GreetingService();
		g.greet("홍길동",new KoreanGreeting());
		g.greet("홍길동",new JapaneseGreeting());
		g.greet("홍길동",new EnglishGreeting());
		

	}

}
