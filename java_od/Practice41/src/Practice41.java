// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.print("도형의 x좌표를 입력하세요:");
		s.setX(sc.nextInt());
		System.out.print("도형의 y좌표를 입력하세요:");
		s.setY(sc.nextInt());
		System.out.print("사각형의 x좌표를 입력하세요:");
		r.setX(sc.nextInt());
		System.out.print("사각형의 Y좌표를 입력하세요:");
		r.setY(sc.nextInt());
		System.out.print("사각형의 가로를 입력하세요:");
		r.setLength(sc.nextDouble());
		System.out.print("사각형의 세로를 입력하세요:");
		r.setWidth(sc.nextDouble());
		System.out.print("삼각형의 x좌표를 입력하세요:");
		t.setX(sc.nextInt());
		System.out.print("삼각형의 Y좌표를 입력하세요:");
		t.setY(sc.nextInt());
		System.out.print("삼각형의 밑변을 입력하세요:");
		t.setBase(sc.nextDouble());
		System.out.print("삼각형의 높이를 입력하세요:");
		t.setHeight(sc.nextDouble());
		
		System.out.println("입력된 도형의 정보입니다.\n" + s.toString() + "\n");
		System.out.println("입력된 사각형의 정보입니다.\n" + r.toString() + "\n");
		System.out.println("입력된 삼각형의 정보입니다.\n" + t.toString() + "\n");
		sc.close();
	}
}
