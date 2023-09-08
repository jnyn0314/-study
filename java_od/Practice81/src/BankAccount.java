// 20220803 컴퓨터학과
// 객체 배열 복습
public class BankAccount {
	private String owner;
	private int balance;
	
	public BankAccount() {
		owner = "모름";
		balance = -1;
	}
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	
	public String toString() {
		String rslt = owner + "\t" + balance;
		return rslt;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withDraw(int money) {
		balance -= money;
	}
}
