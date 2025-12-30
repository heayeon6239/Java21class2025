package ifexample;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키를 입력하세요 : ");
		int tall = scan.nextInt();
		
		if(tall >= 120) {
			System.out.println("놀이기구 이용 가능합니다.");
		}else if(tall < 120) {
			System.out.print("부모님과 함께 오셨나요?(yes:1, No:0)");
			int isParents = scan.nextInt();
			
			if(isParents == 1) {
				System.out.println("놀이기구 이용 가능합니다.");
			}else {
				System.out.println("놀이기구를 이용할 수 없습니다.");
			}
		}
	}

}
