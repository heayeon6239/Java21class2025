package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx022 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String,Location2> citys = new HashMap<>();
		
		System.out.println("도시, 경도, 위도를 입력하시오.");
		
		while(citys.size() < 4 ) {
			System.out.print(">>");
			String input = scan.nextLine();
			
			StringTokenizer st = new StringTokenizer(input, ","); // , 기준으로 분리
			String city = st.nextToken().trim(); // 도시(문자)
			Integer la = Integer.parseInt(st.nextToken().trim()); // 위도(숫자) 래퍼클래스 이용하여 파싱 필요!!
			Integer lo = Integer.parseInt(st.nextToken().trim()); // 경도(숫자) 래퍼클래스 이용하여 파싱 필요!!
			
			Location2 L = new Location2(city,la,lo); // Location2 객체화
			
			citys.put(city,L); // HashMap 에 삽입
//			citys.put(L.getCityName(),L); // 이렇게도 가능
			
		}
		
		System.out.println("--------------------------------------");
		
		for(String cityList : citys.keySet()) {
			Location2 loca = citys.get(cityList);
			// 객체 데이터 타입을 지정한 경우 출력할 때 내부적으로 자동 toString()메서드를 호출함 !!!!!!!
			System.out.println(loca.toString());
//			System.out.println(citys.get(cityList)+" "+citys.get(cityList)+" "+citys.get(cityList));
		}
		
		System.out.println("--------------------------------------");
		
		boolean run = true;
		
		while(run) {
			System.out.print("도시이름 >>");
			String cityName = scan.nextLine();
			
			if(citys.containsKey(cityName)) {
				System.out.println(citys.get(cityName).getCityName()+" "+citys.get(cityName).getLatitude()+" "+citys.get(cityName).getLongitude());
			}
			else if(cityName.equals("그만")){ 
				run = false;
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				System.out.println("해당 도시는 없습니다.");
			}
			
			
		}
		
		scan.close();

	}

}
