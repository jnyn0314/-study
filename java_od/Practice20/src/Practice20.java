import java.util.Scanner;
public class Practice20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for(int value : numbers) {
			System.out.print(value + " ");
		}
		System.out.println();
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[numbers.length - 1 - i] + " ");
		}
		
		int sum = 0;
		for(int value : numbers) {
			sum += value;
		}
		System.out.println("\n난수들의 총합: " + sum);
		
		
		float total = 0, avg = 0;
		int count = 0;
		for(int value : numbers) {
			total += value;
			count++;
			avg = total / count; 
		}
		
		String rslt = String.format("%.2f", avg);
		System.out.println("난수들의 평균: " + rslt);
		
		sc.close();
	}

}
