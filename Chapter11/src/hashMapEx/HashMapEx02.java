package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx02 {

	public static void main(String[] args) {
		
//		Location L = new Location(); // Location 객체화
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String,Location> citys = new HashMap<>();
		
		System.out.println("도시, 경도, 위도를 입력하시오.");
		
		while(citys.size() < 4 ) {
			
			Location L = new Location(); // Location 객체화
			
			System.out.print(">>");
			String input = scan.nextLine();
			
			StringTokenizer st = new StringTokenizer(input, ","); // , 기준으로 분리
			String city = st.nextToken(); // 도시
			String latitude = st.nextToken(); // 위도
			String longitude = st.nextToken(); // 경도
			
			Integer la = Integer.parseInt(latitude);
			Integer lo = Integer.parseInt(longitude);
			
			L.setCityName(city);
			L.setLatitude(la);
			L.setLongitude(lo);
			
			citys.put(city,L);
			
		}
		
		System.out.println("--------------------------------------");
		
		for(String cityList : citys.keySet()) {
			System.out.println(citys.get(cityList).getCityName()+" "+citys.get(cityList).getLatitude()+" "+citys.get(cityList).getLongitude());
		}
		
		System.out.println("--------------------------------------");
		
		boolean run = true;
		
		while(run) {
			System.out.print("도시이름 >>");
			String cityName = scan.nextLine();
			
			if(citys.containsKey(cityName)) {
				System.out.println(cityName+" "+citys.get(cityName).getLatitude()+" "+citys.get(cityName).getLongitude());
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
		

	}

}
