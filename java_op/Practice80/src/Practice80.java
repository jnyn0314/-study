// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice80 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Shape s = new Shape();
		
		System.out.println("Circle 객체에 대한 정보를 입력하세요.");
		s.setX(sc.nextInt());
		s.setY(sc.nextInt());
		System.out.println(s.toString());
		
		sc.close();
	}
}
