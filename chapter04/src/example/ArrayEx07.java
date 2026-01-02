package example;

import java.util.*; // 모든 import 가능

public class ArrayEx07 {

	public static void main(String[] args) {
		
		int[] answer = {1, 3, 4, 2, 5};
		Random random = new Random();
		int randomNum0 = random.nextInt(5)+1; 
		int randomNum1 = random.nextInt(5)+1; 
		int randomNum2 = random.nextInt(5)+1; 
		int randomNum3 = random.nextInt(5)+1; 
		int randomNum4 = random.nextInt(5)+1; 
		System.out.printf("%d%d%d%d%d",randomNum0, randomNum1,randomNum2,randomNum3,randomNum4);
		int[] hgdwer = new int[5];
		
		for(int i=0; i<hgdwer.length; i++) {
			if(hgdwer[i] == 0) {
//				hgdwer[i]=randomNum[i];
			}
		}
		
	}

}
