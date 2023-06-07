package ch04.example;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		//숫자 맞추기 게임
		int num = (int)(Math.random()*100 + 1);
		boolean on = true;
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		System.out.println("1 ~ 100 사이의 숫자를 입력해주세요!");
		
		while(on) {
			System.out.print("입력> ");
			
			String n = scanner.nextLine();
			int input_num = Integer.parseInt(n);
			
			if (input_num>100 || input_num<1) {
				System.out.println("1 ~ 100 사이의 숫자로 다시 입력해주세요!");
				continue;
			}
			
			cnt+=1;
			
			if(num < input_num) {
				System.out.println("작은 수를 입력하세요!");
			}
			else if(num > input_num) {
				System.out.println("큰 수를 입력하세요!");
			}
			else  {
				on = false;
			}
		}
		System.out.println("정답입니다! 시도 횟수 : " + cnt + "회");
	}

}
