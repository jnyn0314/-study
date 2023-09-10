// 컴퓨터학과 20220803 정여진
import java.util.Scanner;
public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int radius, height;
		double volume;
		final double PI = 3.141592;
		
		System.out.print("원뿔의 반지름: ");
		radius = sc.nextInt();
		
		System.out.print("원뿔의 높이: ");
		height = sc.nextInt();
		
		System.out.print("원뿔의 부피는: ");
		volume = (double)1/3 * PI * radius * radius * height;
		System.out.println(volume);
		
		sc.close();
	}

}
