package interfaceTest02;

public interface Buy {
	
	void buy();
	
	// 원래 인터페이스에서는 구현체 안씀 (버전8 이후에 디폴트 메서드, 정적 메서드, 프라이빗 메서드로 구현체 가능하지만 사실상 의미 없음)
	default void order() {
		System.out.println("구매주문");
	}
}
