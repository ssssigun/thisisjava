package ch05.sec12;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		
		boolean on = true;
		Scanner scan = new Scanner(System.in);
		int[] scores = null;
		int studentNum = 0;
		int max = 0;
		int sum = 0;
		double avg = 0;
		
		while(on) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			String input = scan.nextLine();
			
			if("1".equals(input)) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
			}
			
			else if("2".equals(input)) {
				if(scores == null) {
					System.out.println("학생 수를 먼저 입력하세요!");			
					continue;
				}
				for (int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "] > " );
					scores[i] = Integer.parseInt(scan.nextLine());
					}
			}
			
			else if("3".equals(input)) {
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] > " + scores[i]);
				}
			}
			
			else if("4".equals(input)) {
				for (int i=0; i<scores.length; i++) {
					sum+=scores[i];
					if (max<scores[i]) {
						max =scores[i];
					}
				}
				avg = (double)sum / scores.length;
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			}
			
			else if("5".equals(input)) {
				on = false;
			}
			else {
				System.out.println("다시 입력하세요! ");
				continue;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");

	}

}
