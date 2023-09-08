// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice36 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
	
		Date[] dateList = new Date[5]; 
		
 		for(int i = 0; i < dateList.length; i++) {
 			System.out.print((i + 1) + " 번째 날짜를 입력하세요:");
 			dateList[i] = new Date();
 			dateList[i].setYear(sc.nextInt());
 			dateList[i].setMonth(sc.nextInt());
 			dateList[i].setDay(sc.nextInt());
 		}
 		// 입력받기 전에 객체를 생성, 입력받은 값은 setter를 이용하여 변수에 저장
 		for(int i =0; i < dateList.length; i++) {
 			System.out.println(i + 1 + "번째 날짜는 " + dateList[i].getYear() + "년 " + dateList[i].getMonth() + "월 " + dateList[i].getDay() + "일입니다.");
 		}
		sc.close();
	}
}
