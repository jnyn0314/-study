// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice78 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력을 원하는 영화의 편수를 입력하세요:");
		int size = sc.nextInt();
		Movie[] list = new Movie[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println(i + "번 영화정보를 입력하세요:");
			System.out.println("영화제목은?");
			String title = sc.next();
			// list[i].setTitle(title);
			System.out.println("감독은?");
			String director = sc.next();
			// list[i].setDirector(director);
			System.out.println("관람 연도는?");
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			Date newDay = new Date(year, month, day);
			
			list[i] = new Movie(title, director, newDay); // 중요!!!!
		}
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].toString());
		}
		
		sc.close();
	}
}
