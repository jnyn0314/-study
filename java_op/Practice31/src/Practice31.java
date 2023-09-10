// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date birth;
		birth = new Date();
		
		System.out.print("태어난 년도를 입력하세요:");
		birth.year = sc.nextInt();
		
		System.out.print("태어난 월을 입력하세요:");
		birth.month = sc.nextInt();
		
		System.out.print("태어난 날짜를 입력하세요:");
		birth.day = sc.nextInt();
		
		System.out.print("당신의 생일은 " + birth.year + "년 " + birth.month + "월 " + birth.day + "일입니다");
		
		sc.close();
	}

}
