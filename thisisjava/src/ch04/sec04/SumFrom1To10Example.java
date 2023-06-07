package ch04.sec04;

public class SumFrom1To10Example {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for(i=1;i<=100;i++)
		{
			sum+=i;
		}

		System.out.println("1~" + (i-1) + "합 : " + sum);
		
		
	}

}
