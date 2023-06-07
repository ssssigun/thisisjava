package ch06.example;

public class Account {
	private int balance = 0;

	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance<0 || balance>1000000) {
			return;
		}
		this.balance = balance;
	}

}
