// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Shape[] list = new Shape[3];
		
		System.out.print("도형의 정보를 입력하세요:(X좌표, Y좌표):");
		list[0] = new Shape(sc.nextInt(),sc.nextInt());
		
		System.out.print("사각형의 정보를 입력하세요:(X좌표, Y좌표, 가로, 세로):");
		list[1] = new Rectangle(sc.nextInt(), sc.nextInt());
		/*
		list[1].setX(sc.nextInt());
		list[1].setY(sc.nextInt());
		*/
		
		// list[1].setLength(sc.nextInt()); // 오류, 왜? -> shape 안에는 length, width가 없으니까 
		// 각 개체에 대한 정보를 입력받은 후 객체 생성(적절한 생성자 호출)
		((Rectangle)list[1]).setLength(sc.nextDouble());
		
		
		System.out.print("삼각형의 정보를 입력하세요:(X좌표, Y좌표, 밑변, 높이):");
		list[2] = new Triangle(sc.nextInt(), sc.nextInt());
		list[2].setX(sc.nextInt());
		list[2].setY(sc.nextInt());
		
		for(int i = 0; i < list.length; i++) {
			list[i].toString();
		}
		
		System.out.println("중심좌표 이동 거리를 입력하세요(dx, dy) : ");
		int dx = sc.nextInt();
		int dy = sc.nextInt();
		
		for(int i = 0; i < list.length; i++) {
			list[i].move(dx, dy);
		}
		
		for(int i = 0; i < list.length; i++) {
			list[i].toString();
		}

		sc.close();
	}

}