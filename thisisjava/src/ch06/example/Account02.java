package ch06.example;


public class Account02 {
	
	private String accountNum;
	private String name;
	private int accountMoney;
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountMoney() {
		return accountMoney;
	}
	public void setAccountMoney(int accountMoney) {
		this.accountMoney = accountMoney;
	}
	
	public void plusAccountMoney(int plusMoney) {
		accountMoney += plusMoney;
	}
	public void minusAccountMoney(int minusMoney) {
		accountMoney -= minusMoney;
	}

}
