// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape s = new Shape(); // 객체 안만들면 안돼!!
		
		System.out.println("도형의 정보를 입력하세요.");
		System.out.println("중심좌표의 x값:");
		s.setX(sc.nextInt());
		System.out.println("중심좌표의 y값:");
		s.setY(sc.nextInt());
		
		Rectangle r = new Rectangle();
		
		System.out.println("사각형의 정보를 입력하세요");
		System.out.println("중심좌표의 x값:");
		r.setX(sc.nextInt());
		System.out.println("중심좌표의 y값:");
		r.setY(sc.nextInt());
		System.out.println("가로길이:");
		r.setWidth(sc.nextInt());
		System.out.println("세로길이:");
		r.setHeight(sc.nextInt());
		
		System.out.println("만들어진 도형의 정보는 다음과 같습니다.");
		
		System.out.println(s.toString());
		r.printInfo();
		
		sc.close();
	}
}
