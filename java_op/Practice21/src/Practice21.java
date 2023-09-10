// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		num1 = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		num2 = sc.nextInt();
		
		System.out.print(num1 + "+" + num2 + "=");
		sum(num1, num2);
		
		System.out.print(num2 + "+" + num1 + "=");
		sum(num1, num2);
		
		sc.close();
	}
	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
}
