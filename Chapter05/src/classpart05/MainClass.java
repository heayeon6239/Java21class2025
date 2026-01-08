package classpart05;

public class MainClass {

	public static void main(String[] args) {
		// 객체화(인스턴스화)
				ClassEx05 ex05 = new ClassEx05();
				
				ex05.randomNum();
//				for(int i=0; i<ex05.hgd.length; i++) {
//					System.out.println(ex05.hgd[i]);
//				}
				
				int score = ex05.check();
				
				System.out.println("점수:"+score);
				

	}

}
