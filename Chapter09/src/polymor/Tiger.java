package polymor;

public class Tiger extends Animal{
	@Override // 오버라이딩(재정의)되면 가상메서드에 저장됨
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}
