//20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		Date birthday = new Date();
		System.out.print("태어난 년도를 입력하세요");
		birthday.year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요");
		birthday.month = sc.nextInt();
		System.out.print("태어난 일을 입력하세요");
		birthday.day = sc.nextInt();
		System.out.print("당신의 생일은 ");
		birthday.print();
		
		Date adultday = new Date();
		adultday.year = birthday.year + 20;
		adultday.month = birthday.month;
		adultday.day = birthday.day;
		System.out.print("당신의 성년일은 ");
		adultday.print();
		System.out.print("당신의 생일은 ");
		birthday.print();
		
		sc.close();
	}

}
