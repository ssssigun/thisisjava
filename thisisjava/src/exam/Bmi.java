package exam;

public class Bmi {
	public static void main(String[] args) {
		double height = 180;
		double weight = 80;
		
		// 메서드 호출 및 출력
		System.out.println(bmi(height, weight));
	}
	
	// 해당 메서드를 작성하시오.
	public static  String bmi(double height,double weight) {
		double result = weight/Math.pow(height/100, 2);
		String r = "";
		if (result>=25) {
			r = "비만";
		}
		else if (result>=18.5) {
			r = "표준";
		}
		else {
			r = "저체중";
		}
		
		return r;
	}
}
