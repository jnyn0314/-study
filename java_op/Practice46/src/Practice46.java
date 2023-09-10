// 20220803 컴퓨터학과 정여진 
import java.util.Scanner;

public class Practice46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie obj = new Movie();
		
		System.out.println("영화정보를 입력하세요");
		System.out.print("영화제목은?");
		obj.setTitle(sc.next());
		System.out.print("평점은?");
		obj.setScore(sc.nextInt());
		System.out.print("감독은?");
		obj.setDirector(sc.next());
		System.out.print("개봉년도는?");
		obj.setYear(sc.nextInt());
		System.out.println("입력한 영화의 정보입니다.");
		String info = obj.toString();
		
		System.out.println(info);
		sc.close();
	}
}
