// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle obj = new Rectangle();
		
		System.out.print("사각형의 가로:");
		obj.setWidth(sc.nextInt());
		System.out.print("사각형의 세로:");
		obj.setHeight(sc.nextInt());
		
		System.out.println("사각형의 가로는" + obj.getWidth() + "이고, 세로는 " + obj.getHeight() +"입니다.");
		System.out.println("사각형의 넓이는" + obj.perimeter() + "이고, 넓이는 " + obj.area() + "입니다.");
		
		sc.close();
	}
}
