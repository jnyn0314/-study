import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("숫자를 입력하세요:");
		
		int num = sc.nextInt();
		int total = 0;
		int count = 0;
	
		while(num != 0) {
			if(num > 0) {
				total += num;
				count++;
				System.out.println("숫자를 입력하세요:");
				num = sc.nextInt();
			}
			if(num < 0) {
				System.out.println("음수가 입력되었습니다. 다시 입력하세요");
				System.out.println("숫자를 입력하세요:");
				num = sc.nextInt();
			}
		}
		float avg = (float)total / count;
		System.out.println("입력된 숫자들의 합은 " + total + "입니다.");
		System.out.println("입력된 숫자들 중에서 0보다 큰 숫자의 개수는 " + count + "입니다.");
	
		String str = String.format("%.2f", avg);
		System.out.println("입력된 숫자들의 평균은 " + str + "입니다.");
		
		sc.close();
	}
}
