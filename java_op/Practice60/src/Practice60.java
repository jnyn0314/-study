// 20220803 컴퓨터학과 정여진

import java.util.Scanner;

public class Practice60 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student(sc.next(), sc.nextInt());
		Student s2 = new Student(sc.next(), sc.nextInt());
    
		System.out.println(s1.getName() + " 학생은 " + s1.getYear() + "학년입니다.");
		System.out.println(s2.getName() + " 학생은 " + s2.getYear() + "학년입니다.");
	
		sc.close();
	}
}
