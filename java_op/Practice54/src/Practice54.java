// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice54 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("제주행 비행기의 정보를 입력하세요.");
		Plane Jeju = new Plane();
		System.out.print("식별번호:");
		Jeju.setID(sc.nextInt());
		System.out.print("모델:");
		Jeju.setModel(sc.next());
		System.out.print("승객수:");
		Jeju.setCapacity(sc.nextInt());
		
		System.out.println("제주행 비행기의 정보입니다.");
	
		System.out.print(Jeju.toString());
		System.out.println("현재까지 추가된 비행기는 모두 " + Plane.getPlanes() + "대입니다.");
		
		System.out.println("서울행 비행기의 정보를 입력하세요.");
		Plane Seoul = new Plane();
		System.out.print("식별번호:");
		Seoul.setID(sc.nextInt());
		System.out.print("모델:");
		Seoul.setModel(sc.next());
		System.out.print("승객수:");
		Seoul.setCapacity(sc.nextInt());
		
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.print(Seoul.toString());
		System.out.println("현재까지 추가된 비행기는 모두 " + Plane.getPlanes() + "대입니다.");
		
		sc.close();
	}
}