package inheritance04;

public class VIPcutomer extends Customer{
	int agentID = 0;
	
	// 디폴트 기본 생성자
	public VIPcutomer() {};
	
	// 매개변수 생성자
	public VIPcutomer(String id, String name) {
		super(id,name);
		super.bonusRatio = 0.05;
		super.grade = "VIP";
		agentID = 1001;
	}
	
	
	@Override
	// 고객 정보 출력 메서드
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 전문 상담은"+agentID+"번 입니다.";
	}
	
}
