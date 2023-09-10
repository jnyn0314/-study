// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice75 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BodyData bd = new BodyData();
		BodyData b = new BodyData();
		
		System.out.println("내 키를 입력하세요:");
		bd.setHeight(sc.nextInt());
		System.out.println("내 몸무게를 입력하세요:");
		bd.setWeight(sc.nextInt());
		
		System.out.println("당신의 키를 입력하세요:");
		b.setHeight(sc.nextInt());
		System.out.println("내 몸무게를 입력하세요:");
		b.setWeight(sc.nextInt());
		
		if(bd.isTallerThan(b)) {
			System.out.println("키는 내가 더 큽니다.");
		}
		else {
			System.out.println("키는 당신이 더 큽니다.");
		}
		if(bd.needDiet()) {
			System.out.println("나는 다이어트가 필요합니다.");
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
		}
		else {
			System.out.println("나는 다이어트가 필요하지 않습니다.");
			System.out.println("당신은 다이어트가 필요합니다.");
		}
		
		sc.close();
	}
}
