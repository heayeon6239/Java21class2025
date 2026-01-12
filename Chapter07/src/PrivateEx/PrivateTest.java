package PrivateEx;

public class PrivateTest {
	
	// public 접근제어자를 이용하여 멤버변수 정의
	// private 접근제어자는 같은 클래스에서만 접근 허용
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	
	// private 접근제어자는 getter, setter 를 통해 접근 가능
	public void setDay(int day) { // setter
		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("날짜 오류");
			}
		}else {
			this.day = day;
		}
	}
	public int getMonth() { // getter
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
