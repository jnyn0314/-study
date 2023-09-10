// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice82 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//  Shape s = new Shape();
		
		Rectangle r = new Rectangle();
		System.out.println("도형의 x좌표를 입력하세요:");
		r.setX(sc.nextInt());
		System.out.println("도형의 y좌표를 입력하세요:");
		r.setY(sc.nextInt());
		
		System.out.println("사각형의 x좌표를 입력하세요:");
		r.setX(sc.nextInt());
		System.out.println("사각형의 y좌표를 입력하세요:");
		r.setY(sc.nextInt());
		System.out.println("사각형의 가로를 입력하세요:");
		r.setLength(sc.nextInt());
		System.out.println("사각형의 세로를 입력하세요:");
		r.setWidth(sc.nextInt());
		
		Triangle t = new Triangle();
		
		System.out.println("삼각형의 x좌표를 입력하세요:");
		t.setX(sc.nextInt());
		System.out.println("삼각형의 y좌표를 입력하세요:");
		t.setY(sc.nextInt());
		System.out.println("삼각형의 밑변을 입력하세요:");
		t.setBase(sc.nextInt());
		System.out.println("삼각형의 높이를 입력하세요:");
		t.setHeight(sc.nextInt());
	
		/*
		System.out.println("타입:도형");
		System.out.println("중심좌표:(" + r.getX() + "," + r.getY() + ")");
		*/
		
		System.out.println(r.toString());
		System.out.println(t.toString());
		
		sc.close();
	}
}
