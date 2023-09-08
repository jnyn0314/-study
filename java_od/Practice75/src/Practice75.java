// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice75 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 원 c1의 정보입니다.");
		// Point p1 = new Point();
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		
		System.out.println("C2의 정보를 입력하세요:");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		
		Circle c2 = new Circle(x2, y2, r2);
		
		System.out.println(c2.toString());
		
		System.out.println("세번째 원의 정보입니다.");
		Point p3 = new Point();
		p3.setX(60);
		p3.setY(70);
		Circle c3 = new Circle(p3, 80);
		System.out.println(c3.toString());
		
		System.out.println("네번째 원 정보 입력:");
		Point p4 = new Point();
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		int r4 = sc.nextInt();
		
		p4.setX(x4);
		p4.setY(y4);
		
		Circle c4 = new Circle(p4, r4);
		
		System.out.println(c4.toString());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
		
		sc.close();
	}
}
