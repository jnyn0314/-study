// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name; 
		
		System.out.print("이름을 입력하세요 :");
		name = sc.next();
		
		greeting(name);
		
		sc.close();
	}
	public static void greeting(String x) { // 왜 void type에 string 이지?
		System.out.println(x + "씨 좋은 아침입니다.");
	}
}
