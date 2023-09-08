// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
public class Practice81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// BankAccount list[] = new BankAccount[3];
		
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.print("예금주 이름을 입력하세요:");
			
			System.out.print("잔고를 입력하세요:");
			]
		}
		
		int num, work, money;
		
		do {
		System.out.println("현재 잔고현황입니다.");
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(i + "\t" + list[i].toString());
		}
		
		System.out.print("업데이트할 계좌번호를 입력하세요(종료 - 0):");
			num = sc.nextInt();
		
		if(num == 0) {
			break;
		}
		System.out.println("원하는 작업을 선택하세요(1-입금/2-출금)");{
			work = sc.nextInt();
			if(work == 1) {
				System.out.println("입금액을 입력하세요");
				money  =sc.nextInt();
				list[num].deposit(num, money);
			System.out.println("입금이 완료되었습니다.");
			}
			else if(work == 2) {
				System.out.println("출금액을 입력하세요:");
				money = sc.nextInt();
				list[num].withdraw(num, money);
			System.out.println("출금이 완료되었습니다.");
			}
		}
	}while(num != 0);
		System.out.println("프로그램을 종료합니다.");

		sc.close();
	}
	public static void load(String frame, ArrayList<BankAccount> list) {
		try {
			Scanner scan = new Scanner(new FileReader(frame));
			
			while(scan.hasNext()) {
				/*
				if(scan.hasNextInt()) {
					list.add(scan.hasNext());
				}
				*/
				BankAccount ba = new BankAccount();
				
				
			}
		}
	}
}