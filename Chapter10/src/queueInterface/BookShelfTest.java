package queueInterface;

public class BookShelfTest {

	public static void main(String[] args) {
		
		// Queue 데이터 타입으로 업캐스팅
		Queue qshelf = new BookShelf();
		
		// 문자 삽입
		qshelf.inQueue("A");
		qshelf.inQueue("B");
		qshelf.inQueue("C");
		qshelf.inQueue("D");
		// 문자 하나씩 삭제(꺼내기)
		System.out.println(qshelf.deQueue()); // A
		System.out.println(qshelf.deQueue()); // B
		System.out.println(qshelf.deQueue()); // C
		System.out.println(qshelf.deQueue()); // D

	}

}
