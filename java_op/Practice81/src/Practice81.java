// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice81 {

	public static void main(String[] args) {
		
		// Student s1 = new Student(1111, 100, 3.2);
		
		Scanner sc = new Scanner(System.in);
		
		/*
		Undergraduate u = new Undergraduate(2222, 100, 3.40, 3);
		Graduate g1 = new Graduate(3333, 100, 3.40, "SE");
		Graduate g2 = new Graduate(5555, 100, 4.00, "OS");
		VisitingStudent s = new VisitingStudent(4444, 100, 2.5);
		 */	
		Undergraduate u = new Undergraduate();
		u.setRate(sc.nextDouble());
		
		u.setTuition(sc.nextInt());
		u.setGpa(sc.nextDouble());
		
		Graduate g1 = new Graduate();
		g1.setTuition(sc.nextInt());
		g1.setGpa(sc.nextDouble());
		
		Graduate g2 = new Graduate();
		g2.setTuition(sc.nextInt());
		g2.setGpa(sc.nextDouble());
		
		VisitingStudent s = new VisitingStudent(0, 0, 0);
		s.setTuition(sc.nextInt());
		s.setGpa(sc.nextDouble());
		
		System.out.println(u.toString());
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		System.out.println(s.toString());
		
		sc.close();
	}
}
