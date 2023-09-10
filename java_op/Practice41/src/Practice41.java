// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle recInfo = new Rectangle();
		
		System.out.print("가로 입력");
		recInfo.width = sc.nextInt();
		System.out.print("세로 입력");
		recInfo.height = sc.nextInt();
		
		System.out.println("면적은 " + recInfo.area() + "입니다.");
		System.out.println("둘레는 " + recInfo.perimeter() + "입니다.");
		
		sc.close();
	}

}
