// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice40 {

	public static void main(String[] args) {
		// 첫 번째로 입력한 학생과 나머지 모든 학생들의 전공과 학번을 비교하여 출력
		// 학생 숫자를 입력받아 39번이랑 똑같이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 숫자를 입력하세요:");
		int num = sc.nextInt();
		
		Student[] list = new Student[num]; // 객체 화살표 생성
		
		for(int i = 0; i < list.length; i++) {
			System.out.println((i + 1) + "번 학생의 정보");
			list[i] = new Student();
			System.out.print("이름:");
			list[i].setName(sc.next());
			System.out.print("학번:");
			list[i].setSid(sc.nextLong());
			System.out.print("전공:");
			list[i].setMajor(sc.next());
			System.out.println();
		}

		System.out.println("입력된 학생의 정보입니다.");
		
		for(int i = 0; i < list.length; i++) {
			System.out.println("[" + (i + 1) + "]" + list[i].printSafely());
		}
		
		for(int i = 1; i < list.length; i++) {
			
			System.out.print("\"" + list[0].getName() + "\" 학생은 \"" + list[i].getName() +  "\" 학생과");
			
			if(list[0].equalsMajor(list[i])) {
				if(list[0].isSenior(list[i]) == -1){
					System.out.println(" 전공은 같고, 학번은 빠릅니다.");
				}
				else if(list[0].isSenior(list[i]) == 0) {
					System.out.println(" 전공도 같고 학번도 같습니다.");
				}
				else {
					System.out.println(" 전공은 같고, 학번은 느립니다.");
					}	
				}
			else {
				if(list[0].isSenior(list[i]) == -1)
				{
					System.out.println(" 전공은 다르고, 학번은 빠릅니다.");
				}
				else if(list[0].isSenior(list[i]) == 0) {
					System.out.println(" 전공은 다르고 학번은 같습니다.");
				}
				else {
					System.out.println(" 전공은 다르고, 학번은 느립니다.");
					}
				}	
		}
		sc.close();
	}
}