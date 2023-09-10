// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rslt1 = new Rectangle();
		Rectangle rslt2 = new Rectangle();
		
		System.out.println("첫 번째 사각형의 정보를 입력하세요");
		System.out.print("가로 입력:");
		rslt1.width = sc.nextInt();
		System.out.print("세로 입력:");
		rslt1.height = sc.nextInt();
		System.out.println("두 번째 사각형의 정보를 입력하세요");
		System.out.print("가로 입력");
		rslt2.width = sc.nextInt();
		System.out.print("세로 입력:");
		rslt2.height = sc.nextInt();
		
		System.out.println("첫 번째 사각형의 면적은 " + (rslt1.width * rslt1.height) + "입니다.");
		System.out.println("첫 번째 사각형의 둘레는 " + (rslt1.width + rslt1.height) * 2 + "입니다.");
		System.out.println("두 번째 사각형의 면적은 " + (rslt2.width * rslt2.height) + "입니다.");
		System.out.println("두 번째 사각형의 둘레는 " + (rslt2.width + rslt2.height) * 2 + "입니다.");
		
		sc.close();
	}

}

