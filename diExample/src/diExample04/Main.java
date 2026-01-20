package diExample04;

public class Main {

	public static void main(String[] args) {

		MessageSender ms = new MessageSender();
		ms.msgSender("홍길동", "안녕하세요",new SmsMessage());
		ms.msgSender("홍길동", "안녕하세요",new EmailMessage());
		ms.msgSender("홍길동", "안녕하세요",new KakaoMessage());

	}

}
