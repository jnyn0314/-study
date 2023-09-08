// 20220803 컴퓨터학과 정여진
public class Practice76 {

	public static void main(String[] args) {
		System.out.println("첫 번째 영화의 정보입니다.");
		Movie m1 = new Movie();
		System.out.println(m1.toString());
		
		System.out.println("두 번째 영화");
		String title = "영화2";
		String director = "d2";
		Date d2 = new Date();
		Movie m2 = new Movie(title, director, d2);
		System.out.println(m2.toString());
	}
}
