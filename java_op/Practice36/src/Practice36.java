// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie info1 = new Movie();
		
		System.out.println("영화정보를 입력하세요:");
		System.out.print("영화제목은?");
		info1.title = sc.next();
		System.out.print("평점은?");
		info1.score = sc.nextInt();
		System.out.print("감독은?");
		info1.director = sc.next();
		System.out.print("개봉 년도는?");
		info1.year = sc.nextInt();
		
		Movie info2 = new Movie();
		
		System.out.println("\n영화정보를 입력하세요:");
		System.out.print("영화제목은?");
		info2.title = sc.next();
		System.out.print("평점은?");
		info2.score = sc.nextInt();
		System.out.print("감독은?");
		info2.director = sc.next();
		System.out.print("개봉 년도는?");
		info2.year = sc.nextInt();
		
		if(info1.score > info2.score)
			System.out.println("영화 " + info1.title + "이 " + info2.title + "보다 평점이 더 높습니다.");
		else if(info1.score < info2.score)
			System.out.println("영화 " + info1.title + "이 " + info2.title + "보다 평점이 더 낮습니다.");
		else
			System.out.println("영화 " + info1.title + "이 " + info2.title + "와 평점이 같습니다.");
		
		if(info1.year < info2.year)
			System.out.println("영화 " + info1.title + "이 " + info2.title + "보다 먼저 개봉되었습니다.");
		else if(info1.year > info2.year)
			System.out.println("영화 " + info1.title + "이 " + info2.title + "보다 나중에 개봉되었습니다.");
		else
			System.out.println("영화 " + info1.title + "이 " + info2.title + "와 같은 년도에 개봉되었습니다.");
		
		sc.close();
	}

}
