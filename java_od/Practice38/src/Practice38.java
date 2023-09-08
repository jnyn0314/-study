// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Date[] list;
		list = new Date[5];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = new Date();
			System.out.print(i + 1 + "번째 날짜를 입력하세요: ");
			list[i].setYear(sc.nextInt());
			list[i].setMonth(sc.nextInt());
			list[i].setDay(sc.nextInt());
		}
		
		Date earliest = list[0];
		int early_Index = 0;
		
		for(int i = 0; i < list.length; i++) {
			if(Date.compareDate(earliest, list[i]) == 1) {
				earliest = list[i];
				early_Index = i;
			}
		}
		System.out.println("가장 빠른 날짜는 " + (early_Index + 1) + "번째 입력된 " + earliest.getYear() + "년 " + earliest.getMonth() + "월 " + earliest.getDay() + "일입니다.");		
		
		sc.close();
	}
}
