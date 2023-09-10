// 컴퓨터학과 20220803 정여진
import java.util.Scanner;
public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total, num500, num100, num50, num10, left;
		
		System.out.print("거스름돈 총액: ");
		total = sc.nextInt();
		
		System.out.print("500원짜리 동전 : ");
		num500 = total / 500;
		left = total % 500;
		System.out.println(num500 + "개");
		
		System.out.print("100원짜리 동전: ");
		num100 = left / 100;
		left = left % 100;
		System.out.println(num100 + "개");
		
		System.out.print("50원짜리 동전: ");
		num50 = left / 50;
		left = left % 50;
		System.out.println(num50 + "개");
		
		System.out.print("10원짜리 동전: ");
		num10 = left / 10;
		left = left % 10;
		System.out.println(num10 + "개");
		
		sc.close();
	}

}
