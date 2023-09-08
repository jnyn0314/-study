// 20220803 컴퓨터학과 정여진
// 객체배열과 다형성
import java.util.Scanner;
public class Practice45 {

	public static void main(String[] args) {
		// 입력받은 크기의 student 객체 배열 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기:");
		
		int size = sc.nextInt();
	
		Student[] list = new Student[size]; // 참조 변수 선언과 동시에 배열 객체 생성
		
		Student s1 = new Student(sc.nextInt(), sc.nextInt(), sc.nextDouble());
		list[0] = s1;
		
		Student s2 = new UndergraduateStudent(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
		list[1] = s2;
		
		Student s3 = new GraduateStudent(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.next());
		list[2] = s3;
		
		int id;
		
		for(int i = 0; i < list.length; i++) {
			
		System.out.print(i + 1 + " 번째 학생 타입:");
		id = sc.nextInt();

		/*
		if(id == 1) {
			System.out.print("학생 정보 입력:");
			list[i] = new Student(sc.nextInt(), sc.nextInt(),sc.nextDouble()); 
			} // 입력받은 정보로 객체 생성, 배열에 객체 연결
		else if(id == 2) {
			System.out.print("학부생 정보 입력:");
			list[i] = new UndergraduateStudent(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
		} // 다형성
		else {
			System.out.print("대학원생 정보 입력:");
			list[i] = new GraduateStudent(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.next());
		}
		System.out.println();
		}
		*/
		
		printAll(list); 
		
		sc.close();
		}
	}
	public static void printAll(Student[] s) {
		// 배열에 포함된 각 객체의 내용을 toString 메소드를 이용해 화면에 출력
		System.out.println("입력된 정보입니다.");
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString()); // 여기 출력 어떻게 했는지 잘봐	
		}
	}
}
