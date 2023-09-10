// 20220803 컴퓨터학과 정여진
public class Practice53 {

	public static void main(String[] args) {
		BankAccount r1 = new BankAccount();
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.print(r1.toString());
		
		BankAccount r2 = new BankAccount("김동덕", 100);
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		System.out.print(r2.toString());
		
		BankAccount r3 = new BankAccount("홍길동", 2000, 2.15);
		System.out.println("세 번째 은행 계좌의 정보입니다.");
		System.out.print(r3.toString());
	}
}
