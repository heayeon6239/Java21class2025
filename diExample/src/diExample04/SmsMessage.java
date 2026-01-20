package diExample04;

public class SmsMessage implements MsgInterface{

	@Override
	public String msgInter(String name, String contents) {
		
		return "["+name+"]"+"에게"+"["+contents+"]"+"SMS로 전송";
	}



}
