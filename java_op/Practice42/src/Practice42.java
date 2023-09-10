// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice42 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Date birthday = new Date();
	Date adultday = new Date();
	
	System.out.print("태어난 년도를 입력하세요");
	birthday.year = sc.nextInt();
	System.out.print("태어난 월을 입력하세요");
	birthday.month = sc.nextInt();
	System.out.print("태어난 일을 입력하세요");
	birthday.day = sc.nextInt();

	adultday.year = birthday.year + 20;
	adultday.month = birthday.month;
	adultday.day = birthday.day;
	
	String s1 = birthday.toString();
	String s2 = adultday.toString();
	
	System.out.println("당신의 생일은 " + s1 + "입니다.");	
	System.out.println("당신의 성년일은 " + s2 + "입니다.");
	System.out.println("당신의 생일은 " + s1 + "입니다.");
		
		sc.close();
	}
}