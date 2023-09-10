// 20220803 컴퓨터학과 정여진
public class Practice35 {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		account1.name = "김동덕";
		account1.accountNo = "1234-5678";
		account1.balance = 100;
		account1.rate = 0.0;
		
		BankAccount account2 = new BankAccount();
		
		account2.name = "홍길동";
		account2.accountNo = "9999-2531";
		account2.balance = 2000;
		account2.rate = 2.15;
		
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.println("이름: " + account1.name);
		System.out.println("계좌 번호: " + account1.accountNo);
		System.out.println("잔액: " + account1.balance + "원");
		System.out.println("이자율: " + account1.rate);
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		System.out.println("이름: " + account2.name);
		System.out.println("계좌번호: " + account2.accountNo);
		System.out.println("잔액: " + account2.balance + "원");
		System.out.println("이름: " + account2.rate + "%");
	}

}
