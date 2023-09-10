// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		
		System.out.print("정수를 입력하세요: ");
		num1 = sc.nextInt();
		
		int absoluteVaule = abs(num1);
		
		System.out.println("입력된 정수 " + num1 + "의 절댓값은 " + absoluteVaule + "입니다.");
		
		sc.close();
	}
	public static int abs(int n1) {
		if(n1 > 0) {
			return n1;
			}
		else {
			return -n1;
		}
	}
	
}
