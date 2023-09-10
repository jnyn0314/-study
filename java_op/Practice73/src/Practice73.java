// 20220803 컴퓨터학과 정여진
// 입력받는 걸로 바꾸면 어떻게해야할까?
import java.util.Scanner;

public class Practice73 {

	public static void main(String[] args) {
		
		Student s = new Student();
		Graduate g = new Graduate();
		Undergraduate u = new Undergraduate();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("기본 장학금 비율:");
		s.setRate(sc.nextDouble());
		
		System.out.println("첫번째 학생의 등록금");
		s.setTuition(sc.nextInt());
		System.out.println("첫번째 학생의 평균 등급:");
		s.setGpa(sc.nextDouble());
		System.out.println("두번째 학생의 등록금:");
		u.setTuition(sc.nextInt());
		System.out.println("두번째 학생의 평균등급:");
		u.setGpa(sc.nextDouble());
		System.out.println("세번째 학생의 등록금:");
		g.setTuition(sc.nextInt());
		System.out.println("세번째 학생의 평균등급:");
		g.setGpa(sc.nextDouble());
		
		System.out.println(s.toString());
		System.out.println(g.toString());
		System.out.println(u.toString());
		
		sc.close();
	}
}

