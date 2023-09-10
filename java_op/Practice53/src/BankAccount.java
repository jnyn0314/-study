// 20220803 컴퓨터학과 정여진
import java.util.Random;

public class BankAccount {
	Random rd = new Random();
	
	private String name;
	private String accountNo;
	private int balance;
	private double interest;
	
	public String getName() {return name;}
	public String getAccountNo(){return accountNo;}
	public int getBalance() {return balance;}
	public double getInterest() {return interest;}
	
	public void setName(String name) {this.name = name;}
	public void setAccountNo(String accountNo) {this.accountNo = accountNo;}
	public void setBalance(int balance) {this.balance = balance;}
	public void setInterest(int interest) {this.interest = interest;}
	
	public BankAccount() {
		this("모름", 0, 0.0);
	}
	public BankAccount(String name, int balance) {
		this(name, balance, 0);
	}
	public BankAccount(String name, int balance, double interest) {
		this.name = name;
		this.balance = balance;
		this.interest = interest;
		this.accountNo = makeID();
	}
	
	private String makeID() {
		String r;
		int r1, r2;
		r1 = rd.nextInt(9000) + 1000;
		r2  = rd.nextInt(9000) + 1000;
		r = r1 + "-" + r2;
		return r;
	}
	private int calcInterest() {
		int money = (int)(this.balance * this.interest) / 100;
		return money;
	}
	public String toString() {
		String rslt = "이름: " + name + "\n계좌번호: " + accountNo + "\n잔액: " + balance + "원\n이자율: " + interest + "\n이자: " + calcInterest() + "원\n"; 
		return rslt;
	}
}

