package classpart08;

import java.util.Scanner;

// 클래스
public class ClassEx08 {
	// 멤버 변수
	String name = "";
	String[] arAcc = {"1111", "2222", "3333", "4444", "5555","","","","",""};
	String[] arPw = {"1234", "2345", "3456", "4567", "5678","","","","",""};
	int[] arMoney = {87000, 34000, 17500, 98000, 12500,0,0,0,0,0};
	int count = 5;
	int loginCheck = -1;
	int acc = 0; // 로그인한 계좌번호 인덱스

	
	// 디폴트 생성자
	public ClassEx08() {};
	
	// 01. 계좌 프린트
	public void mainPrint() {
		System.out.println("----------------------");
		System.out.println("계좌번호\t비밀번호\t계좌잔액");
		System.out.println("----------------------");
		for(int i=0; i<count; i++) {
			System.out.println(arAcc[i]+"\t"+arPw[i]+"\t"+arMoney[i]);
		}
		System.out.println("----------------------");
		System.out.println();
		System.out.println("["+name+"]");
		if(loginCheck == -1) {
			System.out.println("상태: 로그아웃");
		}else {
			System.out.println("상태: "+arAcc[acc]);
		}
		System.out.println("[1]회원가입");
		System.out.println("[2]로그인");
		System.out.println("[3]로그아웃");
		System.out.println("[4]입금");
		System.out.println("[5]이체");
		System.out.println("[6]잔액조회");
		System.out.println("[0]종료");
	}
	
	// 02-(1) 회원가입
	public boolean menuClick01(String account,String pw, int money) {
		// 아이디 중복 체크
		for(int i=0; i<count; i++) {
			if(arAcc[i].equals(acc)) return false; // 아이디 중복
		}
		arAcc[count] = account;
		arPw[count] = pw;
		arMoney[count] = money+1000;
		count ++;
		return true; // 아이디 중복이 안된 경우
	}
	
	// 02-(2) 로그인
		public void menuClick02(String account,String pw) {
			if(loginCheck != -1) {
				System.out.println("현재 로그인 상태입니다.");
			}else {
				for(int i=0; i<arAcc.length; i++) {
					if(arAcc[i].equals(account) && arPw[i].equals(pw)) {
						System.out.println("로그인 성공");
						loginCheck = 1;
						acc = i;
						return;
					}
				}
				System.out.println("계좌와 비번을 확인해주세요.");
			}
		}
	
	// 02-(3) 로그아웃
	public void menuClick03() {
		if(loginCheck == 1) {
			System.out.println("로그아웃되었습니다.");
			loginCheck = -1;
		}else {
			System.out.println("이미 로그아웃 상태입니다.");
		}
		
	}
	
	// 02-(4) 입금
		public void menuClick04(int money) {
			arMoney[acc] += money;
		}
		
	// 02-(5) 이체
	public void menuClick05(String account, int money) {
		for(int i=0; i<count; i++) {
			if(money > arMoney[acc]) { // 이체금액이 부족할 때
				System.out.println("이체 금액이 부족합니다.");
				return;
			}else {
				if(arAcc[i].equals(account)) { // 존재하는 계좌번호인지 비교
					arMoney[i] += money;
					arMoney[acc] -= money;
					return;
				}
			}
		}
		System.out.println("계좌번호를 다시 확인해주세요.");
	}
	
	// 02-(6) 잔액조회
	public int menuClick06() {
		return arMoney[acc];
	}
		
	
}