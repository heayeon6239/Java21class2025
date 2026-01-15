package interfaceEx02;

public class Cat implements Animal{

	@Override
	public void eat(String bab) {
		System.out.println(bab);
		
	}

	@Override
	public void work(String move) {
		System.out.println(move);
		
	}

	@Override
	public void sleep(String zzz) {
		System.out.println(zzz);
		
	}

}
