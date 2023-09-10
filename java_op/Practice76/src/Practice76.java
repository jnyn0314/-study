// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rw1 = 0, rh1 = 0, rw2 = 0, rh2 = 0;
		
		Rectangle r1 = new Rectangle(rw1, rh1);
		Rectangle r2 = new Rectangle(rw2, rh2);
		
		System.out.println("사각형1의 가로를 입력:");
		rw1 = sc.nextInt();
		System.out.println("사각형1의 세로를 입력:");
		rh1 = sc.nextInt();
		System.out.println("사각형2의 가로를 입력:");
		rw2 = sc.nextInt();
		System.out.println("사각형2의 세로를 입력:");
		rh2 = sc.nextInt();
		
		if(r1.isSmallerThan(r2) == r2.isSmallerThan(r1)) {
			System.out.println("두 사각형의 넓이는 같습니다.");
		}
		else if(r1.isSmallerThan(r2)) {
			System.out.println("사각형 2의 넓이가 더 작습니다.");
		}
		else {
			System.out.println("사각형 1의 넓이가 더 작습니다.");
		}
		
		sc.close();
	}
}
