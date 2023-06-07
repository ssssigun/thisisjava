package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다.");

		
		//확인문제
		//3
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
		
		//4
		int value =356;
		System.out.println(value/100 * 100);
		
		//5
		int top = 5;
		int bottom = 10;
		int height= 7;
		System.out.println(( top+bottom )* height/2.0);
		System.out.println(( top+bottom )* height *1.0/2);
		System.out.println((double)( top+bottom )* height/2);
		System.out.println((double)(( top+bottom )* height/2));
		
	
		
	}

}
