// 20220803 컴퓨터학과 정여진
import java.util.Random;
public class BankAccount {
	private String name, accountNo;
	private int balance;
	private double rate;
	
	Random rd = new Random();
	
	public BankAccount() {
		this.name = "";
		this.accountNo = "";
		this.balance = 0;
		this.rate = 0;
	} // 초기화
	
	public BankAccount(String name, int balance, double rate) {
		this.name = name;
		this.accountNo = (rd.nextInt(9000) + 1000) + "-" + (rd.nextInt(9000) + 1000);
		this.balance = balance;
		this.rate = rate;
	}
	
	// 설정자와 접근자 추가
	public String getName() {return name;}
	public String getAccountNo() {return accountNo;}
	public int getBalance() {return balance;}
	public double getRate() {return rate;}
	public void setName(String name) {this.name = name;}
	public void setAccountNo(String accountNo) {this.accountNo = accountNo;}
	public void setBalance(int balance) {this.balance = balance;}
	public void setRate(double rate) {this.rate = rate;}
	
	public String toString() {
		return getAccountNo() + "::" + name + "::" + balance + "원::" + rate + "%";
	}
	/*
	public int calcInterest() {
		int clac = (int)(balance * rate) / 100; // (int)쓸 때 괄호 위치 주의
		return clac;
	}//잔액과 이자율을 이용하여 이자 계산
	*/
	public boolean transfer(BankAccount otherAccount, int amount) {
		amount = getBalance(); 
		
		if(amount < 0)
			return false;
		else {
			this.balance -= amount;
			otherAccount.balance += amount;
			return true;
		}
	}
}



