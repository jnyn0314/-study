// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Date[] list;
		list = new Date[2];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = new Date();
			if(i == 0) {
				System.out.println("첫 번째 날짜를 입력하세요.");
			}
			else if(i == 1) {
				System.out.println("두 번째 날짜를 입력하세요.");
			}
			System.out.print("년도: ");
			list[i].setYear(sc.nextInt());
			System.out.print("월: ");
			list[i].setMonth(sc.nextInt());
			System.out.print("일: ");
			list[i].setDay(sc.nextInt());
		}
		
			if(Date.compareDate(list[0], list[1]) == -1) {
				System.out.println("두 번째 날짜인 " + list[0].toString() + "이 이른 날짜입니다.");
			}
			else if(Date.compareDate(list[0], list[1]) == 1) {
				System.out.println("첫 번째 날짜인 " + list[1].toString() + "이 이른 날짜입니다.");
			}
			else {
				System.out.println("두 날짜는 같습니다.");
			}
		sc.close();
	}
}
