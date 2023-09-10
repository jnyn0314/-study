// 20220803 컴퓨터학과 정여진
public class BankAccount {
	private String name, accountNo;
	private int balance;
	private double rate;
	
	// 설정자와 접근자 추가
	public String getName() {return name;}
	public String getAccountNo() {return accountNo;}
	public int getBalance() {return balance;}
	public double getRate() {return rate;}
	public void setName(String n) {name = n;}
	public void setAccountNo(String a) {accountNo = a;}
	public void setBalance(int b) {balance = b;}
	public void setRate(double r) {rate = r;}
	
	public String toString() {
		String result = "이름:" + name + "\n계좌번호:" + accountNo + "\n잔액:" + balance + "원\n이자율:" + rate + "%\n이자:" + calcInterest() + "원";
		return result;
	}
	public int calcInterest() {
		int clac = (int)(balance * rate) / 100; // (int)쓸 때 괄호 위치 주의
		return clac;
	}//잔액과 이자율을 이용하여 이자 계산
}
