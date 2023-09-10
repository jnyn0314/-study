// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		double x, f;
		
		System.out.print("x 값을 입력하세요: ");
		x = sc.nextDouble();
		
		if(x <= 0)
			f = x * x * x - 9 * x + 2;
		else
			f = 7 * x + 2;
		
		System.out.print("f(x) = " + f);
		
		sc.close();
	}

}
