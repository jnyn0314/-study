import java.util.Scanner;
public class Practice09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("숫자를 입력하세요:");
		
		int num = sc.nextInt();
		int total = 0;
		
		while(num != 0) {
			if(num > 0) {
				total += num;
				System.out.println("숫자를 입력하세요:");
				num = sc.nextInt();
			}
			if(num < 0) {
				System.out.println("음수가 입력되었습니다. 다시 입력하세요");
				System.out.println("숫자를 입력하세요:");
				num = sc.nextInt();
			}
		}
		System.out.println("입력된 숫자들의 합은" + total + "입니다.");
		sc.close();
	}
}
