package diExample02;

public class GreetingService {
	
	public void greet(String name, Inter inter) {
		// DI
		String msg = inter.inter(name);
		System.out.println(msg);
	}

}
