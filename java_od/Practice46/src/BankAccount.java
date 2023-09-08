// 20220803 컴퓨터학과 정여진
public class BankAccount {
	private String owner; // 계좌주 이름
	private int balance; // 은행 잔고
	
	public BankAccount() {
		owner = "";
		balance = -1;
	}
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 소속 메소그
	public String toString() {
		String rslt = "";
		rslt = owner + "\t" + balance; 
		return rslt;
	}
	
	public void deposit(int num, int money) {
		balance += money;
	}
	public void withdraw(int num, int money) {
		balance -= money;
	}
}
