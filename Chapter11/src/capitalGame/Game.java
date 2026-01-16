package capitalGame;

public class Game {
	private String country;
	private String capital;
	
	// 기본 디폴트 생성자
	public Game() {};
	
	// 매개변수 생성자
	public Game(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	
	// 기본으로 담긴 나라, 수도
	public void basic() {
		String[] con = {"러시아","미국","일본","한국","영국","프랑스"};
		String[] cap = {"모스크바","워싱턴DC","도쿄","서울","런던","파리"};
	}
	
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	
}
