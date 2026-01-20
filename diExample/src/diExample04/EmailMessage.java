package diExample04;

public class EmailMessage implements MsgInterface{

	@Override
	public String msgInter(String name, String contents) {
		return "["+name+"]"+"에게"+"["+contents+"]"+"Email로 전송";
	}

}
