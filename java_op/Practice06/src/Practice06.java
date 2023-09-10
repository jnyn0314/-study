// 컴퓨터학과 20220803 정여진
import java.util.Scanner;
public class Practice06 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius, height, volume;
		final double PI = 3.141592;
		
		System.out.print("원기둥의 반지름: ");
		radius = sc.nextInt();
		
		System.out.print("원기둥의 높이: ");
		height = sc.nextInt();
		
		System.out.print("원기둥의 부피는: ");
		volume = radius * radius * height * PI;
		
		System.out.printf("%.2f", volume); // 소수점 두째자리까지 출력하는 방법은?
		sc.close();
	}
}
