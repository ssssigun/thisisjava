package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		String[] token = board.split(",");

		System.out.println("번호 : " + token[0]);
		System.out.println("제목 : "+ token[1]);
		System.out.println("내용: "+ token[2]);
		System.out.println("성명 : "+ token[3]);
		System.out.println();
		
		for(int i=0; i<token.length;i++) {
			System.out.println(token[i]);
		}
		int a =1;
		String b = " "+ a;
		System.out.println(b);
	}

}
