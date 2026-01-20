package diExample04;

public class KakaoMessage implements MsgInterface{

	@Override
	public String msgInter(String name, String contents) {
		return "["+name+"]"+"에게"+"["+contents+"]"+"Kakao로 전송";
	}

}
