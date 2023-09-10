// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 999;
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int n2= sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요: ");
		int n3 = sc.nextInt();
		
		if(n1 < min) {
			min = n1;
		}
		if(n2 < min) {
			min = n2;
		}
		if(n3 < min) {
			min = n3;
		}
		System.out.println("가장 작은 숫자는 " + min + "입니다.");
		
		sc.close();
	}
}
