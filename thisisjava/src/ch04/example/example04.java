package ch04.example;

public class example04 {
	
	public static void main(String[] args) {
		boolean sum5 = true;
		while(sum5) {
			
			int num1 = (int)(Math.random()*6+1);
			int num2 = (int)(Math.random()*6+1);
			
			if(num1+num2 ==5) {
				sum5=false;
				System.out.println("(" + num1 + ", " + num2 + ")");
			}
		}
		
		
	}

}
