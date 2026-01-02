package example;

import java.util.*; // 모든 import 가능

public class ArrayEx10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] seat = {1,1,1,1,1,1,1};
		Boolean run = true;
		int[] JJack = {1,1,1,1,1,1,1};
		// 예매 카운트
		int count = 0;
		// 2명 이상시 추가 좌석 선택
		int plus = 0;
		
		while(run == true) {
			
			System.out.printf("%n===메가 영화관===%n");
			System.out.printf("1.좌석 예매%n2.종료%n메뉴 선택 :");
			int Click = scan.nextInt();
			
			// 1. 좌석 선택 시
			if(Click == 1) {
				System.out.println("예매 인원을 입력하세요[1~7]");
				// - 예매인원 입력
				int peopleNum = scan.nextInt();
				
					// 인원이 1명일 경우
					if(peopleNum == 1) {
						for(int i=0; i<seat.length; i++) {
						//  짝수 좌석일 경우
							if((i+1) % 2 == 0) {
								JJack[i]=2;
							}
						}
						for(int i=0; i<seat.length; i++) {
							if(JJack[i] == 2) {
								System.out.print("[X]");
							}else {
								System.out.print("[ ]");
							}
							
						}
						
						// - 좌석 입력
						System.out.printf("%n좌석 번호 선택[1~7중 홀수만 선택 가능] :");
						int oneSeat = scan.nextInt()-1;
						
						// 예매 가능 좌석(1)일 경우
						if(seat[oneSeat] == 1) {
							seat[oneSeat] =0;
							count += peopleNum;
							System.out.println("예매 완료");
						// 이미 예매된 좌석(0)일 경우
						}else {
							System.out.println("이미 예매가 완료된 자리입니다.");
						}
						
					// 인원이 2명 이상일 경우
					}else {
						
						// - 좌석
						for(int i=0; i<seat.length; i++) {
							if(seat[i] == 0) {
								System.out.print("[X]");
							}else {
								System.out.print("[ ]");
							}
							
						}
						
						// 2명일 경우
						if(peopleNum == 2) {
							
							System.out.printf("%n좌석 번호 선택 :");
							int twoSeat = scan.nextInt()-1;
							
							// 예매 가능 좌석(1)일 경우
							if(seat[twoSeat] == 1) {
								// 7번째 좌석이 아니면서 다음 좌석도 비어있을때
								if(twoSeat != 7 && seat[twoSeat+1] == 1) {
									seat[twoSeat]=0;
									seat[twoSeat+1]=0;
									count += peopleNum;
									System.out.println("예매 완료");
								// 7번째 좌석이면서 6번째 좌석도 비어있을때
								}else if(twoSeat == 7 && seat[twoSeat-1] == 1) {
									seat[twoSeat]=0;
									seat[twoSeat-1]=0;
									count += peopleNum;
									System.out.println("예매 완료");
								}else {
									System.out.println("이미 예매가 완료된 자리입니다.");
								}	
							// 이미 예매된 좌석(0)일 경우
							}else if(seat[twoSeat] == 0 || seat[twoSeat+1] == 0){
								System.out.println("이미 예매가 완료된 자리입니다.");
							}
							
							
						// 2명 이상일 경우
						}else if(peopleNum >= 3) {
							
							System.out.printf("%n좌석 번호 선택 :");
							int twoSeat = scan.nextInt()-1;
							
							// 예매 가능 좌석(1)일 경우
							if(seat[twoSeat] == 1) {
								// 7번째 좌석이 아니면서 다음 좌석도 비어있을때
								if(twoSeat != 7 && seat[twoSeat+1] == 1) {
									seat[twoSeat]=0;
									seat[twoSeat+1]=0;
									count += 2;
									plus = peopleNum - count; // 2명이상 좌석 선택시 1차선택 후 2차선택을 할 인원 수
									if(plus <= 0) {
										System.out.println("예매 완료");
									// 좌석 1개를 더 선택해야할 경우
									}else if(plus % 2 == 1) {
										for(int i=0; i<seat.length; i++) {
											if(JJack[i] == 2) {
												System.out.print("[X]");
											}else {
												System.out.print("[ ]");
											}
											
										}
										
										// - 좌석 입력
										System.out.printf("%n좌석 번호 선택[1~7중 홀수만 선택 가능] :");
										int oneSeat = scan.nextInt()-1;
										
										// 예매 가능 좌석(1)일 경우
										if(seat[oneSeat] == 1) {
											seat[oneSeat] =0;
											count += peopleNum;
											System.out.println("예매 완료");
										// 이미 예매된 좌석(0)일 경우
										}else {
											System.out.println("이미 예매가 완료된 자리입니다.");
										}
									// 좌석을 두개 더 선택해야할경우
									}else {
										System.out.printf("%n좌석 번호 선택 :");
										int addSeat = scan.nextInt()-1;
										
										// 예매 가능 좌석(1)일 경우
										if(seat[addSeat] == 1) {
											// 7번째 좌석이 아니면서 다음 좌석도 비어있을때
											if(addSeat != 7 && seat[addSeat+1] == 1) {
												seat[addSeat]=0;
												seat[addSeat+1]=0;
												count += peopleNum;
												System.out.println("예매 완료");
											// 7번째 좌석이면서 6번째 좌석도 비어있을때
											}else if(addSeat == 7 && seat[addSeat-1] == 1) {
												seat[addSeat]=0;
												seat[addSeat-1]=0;
												count += peopleNum;
												System.out.println("예매 완료");
											}else {
												System.out.println("이미 예매가 완료된 자리입니다.");
											}	
										// 이미 예매된 좌석(0)일 경우
										}else if(seat[addSeat] == 0 || seat[addSeat+1] == 0){
											System.out.println("이미 예매가 완료된 자리입니다.");
										}
									}
									
								// 7번째 좌석이면서 6번째 좌석도 비어있을때
								}else if(twoSeat == 7 && seat[twoSeat-1] == 1) {
									seat[twoSeat]=0;
									seat[twoSeat-1]=0;
									count += 2;
									plus = peopleNum - count;
									if(plus <= 0) {
										System.out.println("예매 완료");
									}
								}else {
									System.out.println("이미 예매가 완료된 자리입니다.");
								}	
							// 이미 예매된 좌석(0)일 경우
							}else if(seat[twoSeat] == 0 || seat[twoSeat+1] == 0){
								System.out.println("이미 예매가 완료된 자리입니다.");
							}
						}
						
					}
						
					
						
							
				}// 2. 종료 선택 시
				else {
					System.out.println("종료되었습니다.");
					int total = count*12000;
					System.out.printf("매출액:%d원",total);
					run = false;
				}
		}
		
	}

}
