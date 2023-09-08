// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice49 { // 52번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Shape[] shape = new Shape[3];
		
		shape[0] = new Shape();
		shape[1] = new Rectangle();
		shape[2] = new Triangle();
		
		shape[0].setX(sc.nextInt());
		shape[0].setY(sc.nextInt());
		
		shape[1].setX(sc.nextInt());
		shape[1].setLength(sc.nextDouble());
		
		/*
		System.out.print("도형의 정보를 입력하세요:(X좌표, Y좌표):");
		Shape s = new Shape();
		s.setX(sc.nextInt());
		s.setY(sc.nextInt());
		*/
		
		System.out.print("사각형의 정보를 입력하세요:(X좌표, Y좌표, 가로, 세로):");
		Rectangle r = new Rectangle(); 
		r.setX(sc.nextInt());
		r.setY(sc.nextInt());
		r.setLength(sc.nextInt());
		r.setWidth(sc.nextInt());
		
		System.out.print("삼각형의 정보를 입력하세요:(X좌표, Y좌표, 밑변, 높이):");
		Triangle t = new Triangle();
		t.setX(sc.nextInt());
		t.setY(sc.nextInt());
		t.setBase(sc.nextInt());
		t.setHeight(sc.nextInt());
		
		System.out.println("도형의 정보입니다.\n" + s.toString());
		System.out.println("사각형" + r.toString());
		System.out.println("삼각형" + t.toString());
		
		System.out.println("중심좌표 이동 거리를 입력하세요(dx, dy) : ");
		int dx, dy;
		dx = sc.nextInt();
		dy = sc.nextInt();
		s.move(dx, dy);
		r.move(dx, dy);
		r.move(dx, dy);
		
		System.out.println("이동된 도형의 정보\n" + s.toString());
		System.out.println("이동된 도형의 정보\n");
		r.draw();
		System.out.println("이동된 도형의 정보\n");
		t.draw();
		
		
		
		
		sc.close();
	}
}