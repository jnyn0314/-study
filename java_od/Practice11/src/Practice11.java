import java.util.Scanner;
public class Practice11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("숫자를 입력하세요:");
		num = sc.nextInt();
		
		while(num <= 0){
		System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		System.out.println("숫자를 입력하세요:");
		num = sc.nextInt();
		}
		
		/*
		if(num == 1) {
			System.out.println("입력된 숫자 " + num + "은 소수가 아닙니다.");
		}
		for(int i = 2; i < num / 2; i++) {
			if(num % i == 0) {
				System.out.println("입력된 숫자 " + num + "은 소수가 아닙니다.");				
			}
			System.out.println("입력된 숫자 " + num + "은 소수입니다.");		
		}
		*/
		
		if(!isPrime(num)) {
			System.out.println("입력된 숫자 " + num + "은 소수가 아닙니다.");
		}
		if(isPrime(num)) {
			System.out.println("입력된 숫자 " + num + "은 소수입니다.");
		}
		sc.close();
	}
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
