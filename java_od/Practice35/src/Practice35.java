// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 순서쌍 x좌표: ");
		int x1 = sc.nextInt();
		System.out.print("1번째 순서쌍 y좌표: ");
		int y1 = sc.nextInt();
		System.out.print("2번째 순서쌍 x좌표: ");
		int x2 = sc.nextInt();
		System.out.print("2번째 순서쌍 y좌표: ");
		int y2 = sc.nextInt();
		
		Pair p1 = new Pair(x1, y1); // 첫번째 pair 객체 생성
		Pair p2 = new Pair(x2, y2); // 두번째 pair 객체 생성
		Pair AddP = Pair.add(p1, p2); // 두 객체를 더해서 새로운 pair 객체 생성
		Pair SubP = Pair.sub(p1, p2);
		Pair MulP = Pair.mult(p1, p2);
		Pair DivP = Pair.div(p1, p2);
		
		System.out.println("입력된 1번 순서쌍:" + p1.toString());
		System.out.println("입력된 1번 순서쌍:" + p2.toString());
		System.out.println("덧셈 결과:" + AddP);
		System.out.println("뺄셈 결과:" + SubP);
		System.out.println("곱셈 결과:" + MulP);
		System.out.println("나눗셈 결과:" + DivP);
		
		sc.close();
	}
}