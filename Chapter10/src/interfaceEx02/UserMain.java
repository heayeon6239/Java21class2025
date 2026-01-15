package interfaceEx02;

public class UserMain {

	public static void main(String[] args) {
		
		Animal c = new Cat();
		c.eat("고양이는 생선을 먹어요.");
		c.work("고양이는 네발로 걸어요.");
		c.sleep("고양이는 엎드려서 자요.");
		
		Animal ch = new Chicken();
		ch.eat("닭은 사료를 먹어요.");
		ch.work("닭은 두발로 걸어요.");
		ch.sleep("닭은 서서 자요.");
		
		Animal m = new Monkey();
		m.eat("원숭이는 과일을 먹어요.");
		m.work("원숭이는 네발 또는 두발로 걸어요.");
		m.sleep("원숭이는 누워서 자요.");
		
//		Animal[] a = {c,ch,m};
//		for(int i=0; i<a.length; i++) {
//			
//		}
		
		
	}

}
