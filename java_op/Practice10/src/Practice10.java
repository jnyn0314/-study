// 컴퓨터학과 20220803 정여진
import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit;
		double celsius;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨온도를 입력하세요: ");
		fahrenheit = sc.nextInt();
		
		System.out.print("섭씨온도를 입력하세요: ");
		celsius = (double)5/9 * (fahrenheit - 32);
		System.out.print("화씨 " +fahrenheit+ "도는 섭씨 "+ celsius + "에 해당합니다.");
		
		sc.close();
	}

}
