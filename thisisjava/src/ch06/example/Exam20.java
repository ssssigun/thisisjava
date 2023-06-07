package ch06.example;

import java.util.Scanner;

public class Exam20 {

	public static void main(String[] args) {
		
		boolean on = true;
		Scanner scan = new Scanner(System.in);
		Account02[] bankAccount = new Account02[100];
		int cnt = 0;
		
		while(on) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 >");
			String inputNum = scan.nextLine();
			
			if("1".equals(inputNum)) {
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				
				Account02 acc = new Account02();
				System.out.print("계좌번호 : ");
				acc.setAccountNum(scan.nextLine());
				
				System.out.print("계좌주 : ");
				acc.setName(scan.nextLine());
				
				System.out.print("초기입금액 : ");
				acc.setAccountMoney(Integer.parseInt(scan.nextLine()));
				
				bankAccount[cnt++] = acc;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				
			}
		
			else if("2".equals(inputNum)) {
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				
				for(int i=0; i<cnt; i++) {
					System.out.println(bankAccount[i].getAccountNum() + "\t" + bankAccount[i].getName() +
							"\t" + bankAccount[i].getAccountMoney());
				}
				
			}
			else if("3".equals(inputNum)) {
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				
				System.out.print("게좌번호 : ");
				String accNum = scan.nextLine();
				System.out.print("예금액 : ");
				int accMoney = Integer.parseInt(scan.nextLine());
				
				for(int i=0; i<cnt; i++) {
					if(accNum.equals(bankAccount[i].getAccountNum())) {
						bankAccount[i].plusAccountMoney(accMoney);
					}
				}
			}
			else if("4".equals(inputNum)) {
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				
				System.out.print("게좌번호 : ");
				String accNum = scan.nextLine();
				System.out.print("출금액 : ");
				
				int accMoney = Integer.parseInt(scan.nextLine());
				
				for(int i=0; i<cnt; i++) {
					if(accNum.equals(bankAccount[i].getAccountNum())) {
						
						if(accMoney>bankAccount[i].getAccountMoney()) {
							System.out.println("출금액이 통장 잔고보다 많습니다!");
						}
						else {
							bankAccount[i].minusAccountMoney(accMoney);
							System.out.println("출금이 성공되었습니다.");
						}
					}
				}
				
			}
			else if("5".equals(inputNum)) {
				
				on = false;
			}
			else {
				System.out.println("다시 입력하세요!");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
