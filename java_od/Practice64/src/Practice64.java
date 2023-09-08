// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열로 이루어진 순서쌍을 만듭니다.");
		System.out.println("첫번째 원소를 입력하세요:");
		String s1 = sc.next();
		System.out.println("두번째 원소를 입력하세요:");
		String s2 = sc.next();
		MyPair<String> p1 = new MyPair<String>(s1, s2);
		System.out.println(p1.toString());
		
		System.out.println("변경할 원소를 선택하세요(1/2)");
		int index = sc.nextInt();
		System.out.println("변경할 원소를 입력하세요:");
		String change = sc.next();
		
		if(index == 1) {
			s1 = change;
		}
		else
			s2 = change;
		
		MyPair<String> p3 = new MyPair<String>(s1, s2); 
		System.out.println("만들어진 순서쌍 : " + p3.toString());
		
		System.out.println("숫자로 이루어진 순서쌍을 만듭니다.");
		System.out.println("첫번째 원소를 입력하세요:");
		int n1 = sc.nextInt();
		System.out.println("두번째 원소를 입력하세요:");
		int n2 = sc.nextInt();
		MyPair<Integer> p2 = new MyPair<Integer>(n1, n2);
		System.out.println(p2.toString());
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		sc.close();
	}

}
