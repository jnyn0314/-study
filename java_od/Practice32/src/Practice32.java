// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice32 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Square s1 = Square.getInstance(sc.nextInt(), sc.nextInt());
		
		Square s2 = Square.getInstance(sc.nextInt(), sc.nextInt());
		
		if(s1.isSmallerThan(s2)) {
			System.out.println("사각형1의 넓이가 더 작습니다.");
		}
		else if(s2.isSmallerThan(s1)){
			System.out.println("사각형의 넓이가 더 작습니다.");
		}
		else {
			System.out.println("두 사각형의 넓이가 같습니다.");
		}
		// getInstance를 생성자 대신 사용해 
		sc.close();
	}

}
