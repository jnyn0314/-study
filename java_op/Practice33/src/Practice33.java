// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rectangle areaAndPerimeter = new Rectangle();
		
		System.out.print("가로 입력 :");
		areaAndPerimeter.width = sc.nextInt();
		System.out.print("세로 입력: ");
		areaAndPerimeter.height = sc.nextInt();
		
		System.out.println("면적은 " + areaAndPerimeter.width * areaAndPerimeter.height + "입니다.");
		System.out.println("둘레는 " + (areaAndPerimeter.width + areaAndPerimeter.height) * 2 + "입니다.");
		sc.close();
	}

}
