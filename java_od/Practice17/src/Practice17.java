import java.util.Scanner;
public class Practice17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("\n");
		for(int i = 0; i < 10; i++) {
			System.out.print(num[9 - i] + " ");
		}
		
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += num[i];
		}
		System.out.println("\n총합:" + sum);
		
		int total = 0;
		float avg = 0;
		
		for(int i = 0; i < 10; i++) {
			total += num[i];
			avg = (float)total / (i + 1);
		}
		String rslt = String.format("%.2f", avg);
		System.out.println("평균:" + rslt);
		
		sc.close();
	}
}
