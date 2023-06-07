package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\",\n" +
		"}";
		System.out.println(str1);
		System.out.println("----------------------");
		
		// 타입추론 (jdc 11이상)
		var a = 1;
		var b = 2;
//		var e = new Example();
		
		int i = 1;
		long l = 1;		//자동형변환
		int i2 = (int)l; //강제형변환
		
		double d = 3.14;
		int d2 = (int)d;		//강제형변환 (소수점 유실)
		System.out.println(d2);
		
		//정수와 정수의 연산은 결과값이 항상 정수
		int kor =  90;
		int eng = 80;
		int math = 87;
		int total = kor + eng + math;
		System.out.println(total);
		
		double avg = total / 3.0;	//하나라도 반드시 실수로 바꿔야함
		System.out.println(avg);
		
		String s = "1"+3;
		System.out.println(s);
		
		int z = Integer.parseInt(s);
		System.out.println(s);		
		System.out.println(s.getClass().getName());
		
	}

}
