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
        int other = 0;
        
        while(run == true) {
            
            // - 좌석 출력
            for(int i=0; i<seat.length; i++) {
                if(seat[i] == 0) {
                    System.out.print("[X]");
                } else {
                    System.out.print("[ ]");
                }
            }
            
            System.out.printf("%n===메가 영화관===%n");
            System.out.printf("1.좌석 예매%n2.종료%n메뉴 선택 :");
            int Click = scan.nextInt();
            
            if(Click == 1) {
                System.out.println("예매 인원을 입력하세요[1~7]");
                int peopleNum = scan.nextInt();
                
                // 1명일 경우
                if(peopleNum == 1) {
                    for(int i=0; i<seat.length; i++) {
                        if((i+1) % 2 == 0) {
                            JJack[i] = 2;
                        }
                    }
                    for(int i=0; i<seat.length; i++) {
                        if(JJack[i] == 2) {
                            System.out.print("[X]");
                        } else {
                            System.out.print("[ ]");
                        }
                    }
                    
                    System.out.printf("%n좌석 번호 선택[1~7중 홀수만 선택 가능] :");
                    int oneSeat = scan.nextInt() - 1;
                    
                    if(seat[oneSeat] == 1) {
                        seat[oneSeat] = 0;
                        count += peopleNum;
                        System.out.println("예매 완료");
                    } else {
                        System.out.println("이미 예매가 완료된 자리입니다.");
                    }
                
                // 2명일 경우
                } else if(peopleNum == 2) {
                    
                    System.out.printf("%n좌석 번호 선택 :");
                    int twoSeat = scan.nextInt() - 1;
                    
                    if(seat[twoSeat] == 1) {
                        if(twoSeat != 6 && seat[twoSeat+1] == 1) {
                            seat[twoSeat] = 0;
                            seat[twoSeat+1] = 0;
                            count += peopleNum;
                            System.out.println("예매 완료");
                        } else if(twoSeat == 6 && seat[twoSeat-1] == 1) {
                            seat[twoSeat] = 0;
                            seat[twoSeat-1] = 0;
                            count += peopleNum;
                            System.out.println("예매 완료");
                        } else {
                            System.out.println("다른 좌석을 선택해주세요.");
                        }
                    } else {
                        System.out.println("이미 예매가 완료된 자리입니다.");
                    }
                
                // 3명 이상일 경우
                } else if(peopleNum >= 3) {
                    
                    other = peopleNum;
                    
                    while(other > 0) {

                        // 현재 좌석 상태 출력
                        for(int i=0; i<seat.length; i++) {
                            if(seat[i] == 0) {
                                System.out.print("[X]");
                            } else {
                                System.out.print("[ ]");
                            }
                        }
                        
                        System.out.printf("%n좌석 번호 선택 :");
                        int addSeat = scan.nextInt() - 1;
                        
                        // 남은 인원이 1명
                        if(other == 1) {
                            if(seat[addSeat] == 1) {
                                seat[addSeat] = 0;
                                count += 1;
                                other -= 1;
                            } else {
                                System.out.println("이미 예매가 완료된 자리입니다.");
                            }
                        
                        // 남은 인원이 2명 이상
                        } else if(other >= 2) {
                            
                            if(seat[addSeat] == 1) {
                                if(addSeat != 6 && seat[addSeat+1] == 1) {
                                    seat[addSeat] = 0;
                                    seat[addSeat+1] = 0;
                                    other -= 2;
                                    count += 2;
                                
                                } else if(addSeat == 6 && seat[addSeat-1] == 1) {
                                    seat[addSeat] = 0;
                                    seat[addSeat-1] = 0;
                                    other -= 2;
                                    count += 2;
                                
                                } else {
                                    System.out.println("다른 좌석을 선택해주세요.");
                                }
                            } else {
                                System.out.println("이미 예매가 완료된 자리입니다.");
                            }
                        }
                    } // while(other > 0) 끝
                    System.out.println("예매 완료");
                
                } // else if(peopleNum >= 3) 끝
            
            // 종료 선택 시
            } else {
                System.out.println("종료되었습니다.");
                int total = count * 12000;
                System.out.printf("매출액:%d원", total);
                run = false;
            }
            
        } // while(run) 끝
        
    } // main 끝
    
} // class 끝
