// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice55 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		
		boolean isDone = false;
		boolean isDone2 = false;
		while(isDone != true) {
			try {
				System.out.println("1번 피연산자를 입력하세요:");
				n1 = Integer.parseInt(sc.next());
				isDone = true;
			}catch(NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요:");
				continue;
			}
		}	
	
		while(isDone2 != true) {
			try {
				System.out.println("2번 피연산자를 입력하세요:");
				n2 = Integer.parseInt(sc.next());
				isDone2 = true;
			}catch(NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요:");
				continue;
			}
		}
		
		
		int rslt = 0; 
		rslt = n1 + n2;
		
		System.out.println(n1 + "+" + n2 + "=" +rslt);
		
		sc.close();
	}
}
