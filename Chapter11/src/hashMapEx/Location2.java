package hashMapEx;

public class Location2 {
	// 멤버변수
	private String cityName;
	private int latitude;
	private int longitude;
	
	// 기본 디폴트 생성자
	public Location2() {};
	
	// 매개변수 디폴트 생성자
	public Location2(String cityName, int latitude, int longitude ) {
		this.cityName = cityName;
		this.latitude = latitude;
		this.longitude = longitude;
	};
	
	
	
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	
	// 자바 최상위 클래스 object
	// Object -> toString()메서드 디폴트 => String 데이터 타입으로 출력할 때 사용
	// 현재 메서드에 최상위 클래스 보는 방법 : ctrl + T
	// 단, 반드시 Override(재정의)해야함
	
	@Override
	public String toString() {
		return cityName + " "+ latitude + " " + longitude;
	}
	
	
	
	
}
