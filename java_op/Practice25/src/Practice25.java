// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		printTime(getInput());
	
	}
	public static int getInput() {
		Scanner sc = new Scanner(System.in);
		int num, count = 0;
		
		System.out.print("정수를 입력하세요:");
		num = sc.nextInt();
		while(count != 1) {
		if(num > 0) {
			printTime(num);
			count++;
		}
		else {
			System.out.println("잘못된 입력입니다. 다시 입력하세요");
			System.out.print("정수를 입력하세요:");
			num = sc.nextInt();	
		}
		}
		sc.close();
		return num;
	
	}
	public static void printTime(int x) {
		int i;
		
		System.out.println("구구단 " + x +"단입니다.");
		
		for(i = 0; i < x; i++) {
			System.out.println(x + " * " + (i+1) + " = " + x * (i + 1));
		}
	}
}
