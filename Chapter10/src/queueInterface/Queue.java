package queueInterface;

public interface Queue {
	
	// Queue 는 자료구조로 FIFO(first in first out) -> 선입선출 방식의 자료구조
	void inQueue(String title); // 맨 뒤로 넣기
	String deQueue(); // 꺼내기(삭제)
	int getSize(); // 개수
}
