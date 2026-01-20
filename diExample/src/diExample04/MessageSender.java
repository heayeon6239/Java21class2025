package diExample04;

public class MessageSender {
	public void msgSender(String name, String contents, MsgInterface msginter) {
		String msg = msginter.msgInter(name,contents);
		System.out.println(msg);
	}
}
