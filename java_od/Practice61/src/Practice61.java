import java.util.Scanner;
public class Practice61 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] ba = new BankAccount[3];
		
		getAccInfo(sc, ba);
		int update = 0;
		
		do {
			printAccInfo(ba);
			
			if(getAccNum(sc, update) == 0) {
				break;
			}
			int work = getNum(sc);
			
			int money = sc.nextInt();
			
		}
		
	}
	public static void workInBank(int money, int update, BankAccount[] ba, int work) {
		if(work == 1) {
			try {
				ba[update].withdraw(money);
			}catch(NegativeBalanceException e) {
				System.out.println(e.getMessage());
			}
		}
			}
	public static void getAccInfo(Scanner scan, BankAccount[] ba) {
		for(int i = 0; i < ba.length; i++) {
			ba[i] = new BankAccount();
		}
		for(int i = 0; i < ba.length; i++) {
			ba[i].setOwner(scan.next());
		}
		
	}
	public static void printAccInfo(BankAccount[] ba) {
		for(int i = 0; i < ba.length; i++) {
			System.out.println((i + 1) + "\t" + ba[i].toString());
		}
	}
	public static int getAccNum(Scanner scan, int update) {
		System.out.println("업데이트?");
		update = scan.nextInt();
		
		return update;
	}
	public static int getNum(Scanner scan) {
		System.out.println("출금? 입금?");
		int work = scan.nextInt();
		return work;
	}
}
