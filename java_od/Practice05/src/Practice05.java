import java.util.Scanner;
public class Practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요:");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("입력한 정수 " + num + "의 절댓값은 " + num + "입니다.");
		}
		else if(num < 0) {
			System.out.println("입력한 정수 " + num + "의 절댓값은 " + -num + "입니다.");
		}
		
		sc.close();
	}

}
