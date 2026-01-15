package interfaceEx01;

public class Refrigerator implements Buyable{
	// 멤버변수
	String name="냉장고";
	String model;
	String denggub;
	int price;
	
	public Refrigerator(String model, String denggub, int price) {
		this.model = model;
		this.denggub = denggub;
		this.price = price;
	}

	
	// 오버라이딩 필요없으면 public class abstract(추상 클래스를 추가) Refrigerator implements Buyable 하면 됨
	// 하지만 여기선 메인에서 인스턴스를 해서 매개변수값을 받아야하기때문에 abstract을 하면 안됨 !!
	@Override
	public String getName() {
		return null;
	}

	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public String getModel() {
		return null;
	}

	@Override
	public String getMaker() {
		return null;
	}

}
