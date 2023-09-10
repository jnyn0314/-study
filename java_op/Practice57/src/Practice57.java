// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice57 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

BankAccount b0 = new BankAccount("김동덕", 100, 3.1);
BankAccount b1 = new BankAccount("홍길동", 2000, 2.15);
BankAccount b2 = new BankAccount("성춘향", 500, 2.05);

System.out.println("은행 계좌 모두의 정보입니다.");
System.out.println(b0.toString());
System.out.println(b1.toString());
System.out.println(b2.toString() + "\n");
System.out.print("계좌 " + b0.getAccountNo() + "에 입금할 금액을 입력하세요: ");

if(b0.deposit(input.nextInt())) {
  System.out.println("입금이 성공했습니다.\n");
} else {
  System.out.println("입금이 실패했습니다.\n");
}

System.out.println("은행 계좌 모두의 정보입니다.");
System.out.println(b0.toString());
System.out.println(b1.toString());
System.out.println(b2.toString() + "\n");
System.out.print("계좌 " + b1.getAccountNo() + "에 출금할 금액을 입력하세요: ");

if(b1.withdraw(input.nextInt())) {
  System.out.println("출금이 성공했습니다.\n");
} else {
  System.out.println("출금이 실패했습니다.\n");
}
System.out.println("은행 계좌 모두의 정보입니다.");
System.out.println(b0.toString());
System.out.println(b1.toString());
System.out.println(b2.toString() + "\n");
System.out.print("계좌 " + b1.getAccountNo() + "에서 계좌 " + b2.getAccountNo() + "으로 송금할 금액을 입력하세요: ");

if(BankAccount.transfer(b1, b2, input.nextInt())) {
System.out.println("송금이 성공했습니다.\n");
} else {
System.out.println("송금이 실패했습니다.\n");
}

System.out.println("은행 계좌 모두의 정보입니다.");
System.out.println(b0.toString());
System.out.println(b1.toString());
System.out.println(b2.toString() + "\n");
input.close();
}
}

 