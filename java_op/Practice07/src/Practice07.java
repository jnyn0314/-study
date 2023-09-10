// 컴퓨터학과 20220803 정여진
import java.util.Scanner;
public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num500, num100, num50, num10, total;
		
		System.out.print("500원 짜리의 개수: ");
		num500 = sc.nextInt();
		
		System.out.print("100원 짜리의 개수: ");
		num100 = sc.nextInt();
		
		System.out.print("50원 짜리의 개수: ");
		num50 = sc.nextInt();
		
		System.out.print("10원 짜리의 개수: ");
		num10 = sc.nextInt();
		
		System.out.print("저금통에 있는 총액: ");
		total = num500 * 500 + num100 * 100 + num50 * 50 + num10 * 10;
			
		System.out.println(total);
		
		sc.close();
	}

}
