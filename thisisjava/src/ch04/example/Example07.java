package ch04.example;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {

		//example 7
		boolean on = true;
		int account = 0 ; 
		Scanner scanner = new Scanner(System.in);
		
		while(on) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			String input = scanner.nextLine();
			if (input.equals("1")) {
				System.out.print("예금액> ");
				String m = scanner.nextLine();
				account += Integer.parseInt(m);
				 
			}
			else if(input.equals("2")) {								//리터럴을 앞에다 하는 게 좋음
				System.out.print("출금액> ");
				String m = scanner.nextLine();
				
				if (account - Integer.parseInt(m) < 0 ) {
					System.out.println("잔액이 부족합니다!");
					System.out.println("현재 잔액 : " + account);
				}
				account -= Integer.parseInt(m);
				
			}
			else if(input.equals("3")) {
				System.out.print("잔고> ");
				System.out.println(account);
		
			}
			else if(input.equals("4")) {
				System.out.print("프로그램 종료");
				on = false;
			}
			else {
				System.out.println("잘못 입력하였습니다. 다시 입력하세요!");
			}
			
		}
		
		
	}

}
