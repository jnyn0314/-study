//20220803 컴퓨터학과 정여진

public class Practice47 {

	public static void main(String[] args) {
		BankAccount info_1 = new BankAccount();
		
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		info_1.setName("김동덕");
		info_1.setAccountNo("1234-5678");
		info_1.setBalance(0);
		info_1.setRate(0.0);
		String s1 = info_1.toString();
		System.out.println(s1);
		
		BankAccount info_2 = new BankAccount();
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		
		info_2.setName("홍길동");
		info_2.setAccountNo("9999-2531");
		info_2.setBalance(2000);
		info_2.setRate(2.15);
		String s2 = info_2.toString();
		System.out.println(s2);
		
	}

}
