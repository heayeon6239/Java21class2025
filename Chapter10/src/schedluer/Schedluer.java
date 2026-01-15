package schedluer;

public interface Schedluer {
	void getNextCall(); // 다음 고객의 call 을 가져오는 메서드
	void sendCallToAgent(); // 상담원에게 call 을 던지는 메서드
	void getLunch(); // 인터페이스에 메서드를 추가했으면 상속받은 클래스에서 추가해줘야함(사용안하더라도)
}
