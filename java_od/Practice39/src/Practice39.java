// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] list = new Student[3];
		
		list[0] = new Student("홍길동", 20111234, "컴퓨터학");
		list[1] = new Student("성춘향", 20121357, "국문학");
		list[2] = new Student("이몽룡", 20101357, "컴퓨터학");
		
		
		for(int i = 0; i < list.length; i++) {
			System.out.println((i +  1) + "번 학생의 정보");
			System.out.println(list[i].printSafely() + "\n");
		}
		
		for(int i = 1; i < 3; i++) {
		
			System.out.print("\"" + list[0].getName() + "\" 학생은 \"" + list[i].getName() +  "\" 학생과");
				if(list[0].equalsMajor(list[i])) {
					if(list[0].isSenior(list[i]) == -1){
						System.out.println("전공은 같고, 학번은 빠릅니다.");
					}
					else if(list[0].isSenior(list[i]) == 0) {
						System.out.println("전공도 같고 학번도 같습니다.");
					}
					else {
						System.out.println("전공은 같고, 학번은 느립니다.");
						}	
					}
				else {
					if(list[0].isSenior(list[i]) == -1)
					{
						System.out.println("전공은 다르고, 학번은 빠릅니다.");
					}
					else if(list[0].isSenior(list[i]) == 0) {
						System.out.println("전공은 다르고 학번도 같습니다.");
					}
					else {
						System.out.println("전공은 다르고, 학번은 느립니다.");
						}
					}
		}
		
		sc.close();	
	}
}
