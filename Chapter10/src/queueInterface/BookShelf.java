package queueInterface;

// Shelf 가 Queue 를 implements
// BookShelf 가 Shelf 를 extends 받을 예정
// 실무에서 많이 사용하는 방식
public class BookShelf extends Shelf implements Queue{

	@Override
	public void inQueue(String title) {
		// 맨 뒤로 넣기
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		// 꺼내기 => 삭제
		return shelf.remove(0); // 제일 첫번째 자료 삭제
	}

	@Override
	public int getSize() {
		return getCount(); // 상속받았기 때문에 getCount() 바로 사용 가능
	}

}
