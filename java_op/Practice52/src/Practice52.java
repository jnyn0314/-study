// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie m0 = new Movie();
		
		System.out.println("디폴트 영화의 정보입니다.");
		System.out.print(m0.toString());
		
		Movie m1 = new Movie();
		
		System.out.println("영화정보를 입력하세요");
		System.out.print("영화제목은?");
		m1.setTitle(sc.next());
		System.out.print("감독은?");
		m1.setDirector(sc.next());
		System.out.print("제작년도는?");
		m1.setYear(sc.nextInt());
		System.out.print("평점은?");
		m1.setScore(sc.nextInt());
		System.out.println("입력한 영화의 정보입니다.");
		System.out.print(m1.toString());		
		sc.close();
	}

}
