// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("내 키를 입력하세요:");
		BodyData me = new BodyData();
		me.setHeight(sc.nextInt());
		System.out.print("내 몸무게를 입력하세요:");
		me.setWeight(sc.nextInt());
		
		System.out.print("당신의 키를 입력하세요:");
		BodyData you = new BodyData();
		you.setHeight(sc.nextInt());
		System.out.print("당신의 몸무게를 입력하세요:");
		you.setWeight(sc.nextInt());
		
		if(me.isTallerThan(you)) {
			if(me.getHeight() > you.getHeight()) {
			System.out.println("키는 내가 더 큽니다.");
			}
			else if(me.getHeight() == you.getHeight()) {
				System.out.println("나와 당신의 키는 같습니다.");
			}
		}
		else if(!me.isTallerThan(you)) {
			System.out.println("키는 당신이 더 큽니다.");
		}
		if(me.needDiet()) {
			System.out.println("나는 다이어트가 필요합니다.");
		}
		else {
			System.out.println("나는 다이어트가 필요하지 않습니다.");
		}
		
		if(you.needDiet()) {
			System.out.println("딩신은 다이어트가 필요합니다.");
		}
		else {
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
		}
		sc.close();
	}

}
