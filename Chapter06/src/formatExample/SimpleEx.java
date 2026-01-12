package formatExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleEx {

	public static void main(String[] args) throws ParseException {
		
		// SimpleDateFormat 클래스는 날짜를 특정 형식의 문자열로 출력, 변환할 때 사용
		// 출력할때 : SimpleFormat.format()
		// 변경할때 : SimpleFormat.parse()
		// SimpleDateFormat 클래스도 new 예약어로 객체 생성하여 사용
		// SimpleDateFormat.format("yyyy-mm-dd") => 따옴표안에 원하는 형식 입력
		
		Scanner scan = new Scanner(System.in);
		
		// 현재 날짜/시간 객체(타입이 Date인 now객체를 생성)
		Date now = new Date();
		
		// 날짜 포맷
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 (E)");
		SimpleDateFormat sdf5 = new SimpleDateFormat("HH:mm:ss a");
		System.out.println(now); // Mon Jan 12 10:42:03 KST 2026
		System.out.println(sdf1.format(now)); // 2026-01-12
		System.out.println(sdf3.format(now)); // 2026년 01월 12일
		System.out.println(sdf4.format(now)); // 2026년 01월 12일 (월)
		System.out.println(sdf5.format(now)); // 10:49:46 오전
		// sdf1.parse("2026-02-03") => 날짜를 문자열 형식으로 입력
		// sdf4.format(sdf1.parse("2026-02-03")) => sdf4형식으로 출력
		System.out.println(sdf4.format(sdf1.parse("2026-02-03"))); // Tue Feb 03 00:00:00 KST 2026
	}

}
