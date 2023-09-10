// 컴퓨터학과 20220803 정여진
import java.util.Scanner;
public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double mile, kilometer;
		
		System.out.print("원하는 마일을 입력하세요: ");
		mile = sc.nextDouble();
		kilometer = mile * 1.609;
		System.out.println(mile + "마일은" + kilometer + "킬로미터입니다.");
		
		sc.close();
	}

}
