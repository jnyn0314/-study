// 컴퓨터학과 20220803 정여진
import java.util.Scanner;
public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money, total, tax, left;
		
		System.out.print("받은 돈 : ");
		money = sc.nextInt();
		System.out.print("상품의 총액 : ");
		total = sc.nextInt();
		System.out.print("부가세 : ");
		tax = total / 10;
		System.out.println(tax);
		System.out.print("잔돈 : ");
		left = money - total;
		System.out.println(left);
		
		sc.close();
	}

}
