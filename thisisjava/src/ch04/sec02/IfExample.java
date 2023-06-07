package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 75;
		if(score>=90) {
			System.out.println("점수가 100~90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		else if(score>=80) {
			System.out.println("점수가 80~89보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		else if(score>=70) {
			System.out.println("점수가 70~79보다 작습니다.");
			System.out.println("등급은 C입니다.");
		}
		else  {
			System.out.println("점수가 70보다 작습니다.");
			System.out.println("등급은 D입니다.");
		}
		
		
		
		double coin = Math.round(Math.random());
		
		if ((int)coin ==0) System.out.println("동전 앞이 나왔습니다.");
		else System.out.println("동전 뒤가 나왔습니다.");
		
		
		
		int score1 = (int)(Math.random()*20) + 81;
		System.out.println("점수 : " + score1);
		
		String grade1;
		
		if (score1>=90) {
			if (score1 >= 95) {
				grade1 = "A+";
			}
			else {
				grade1 = "A";
			}
		}
		else {
			if(score1>=85) {
				grade1 ="B+";
			}
			else {
				grade1 = "B";
			}
		}
		
		System.out.println("학점 : " + grade1);
	}
	
}
