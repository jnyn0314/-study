// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice79 {

	public static BodyData getBodyDataInstance(Scanner s) {
	BodyData bd = new BodyData();
	System.out.println("이름을 입력하세요:");
	bd.setName(s.next());
	System.out.println("키를 입력하세요");
	bd.setHeight(s.nextInt());
	System.out.println("몸무게를 입력하세요:");
	bd.setWeight(s.nextInt());
		return bd;
	}	
	
	@SuppressWarnings("unused")
	private static BodyData compareHeight(BodyData b1, BodyData b2){
		if(b1.getHeight() > b2.getHeight()) {
			return b1;
		}
		else {
			return b2;
		}
	}
	public static void printHeightMsg(BodyData b1, BodyData b2) {
		System.out.println("키는 " + b1.getName() + "이 더 큽니다.");
	}
	public static void printDietMsg(BodyData b) {
		if(b.needDiet()) {
		System.out.println(b.getName() + "은 다이어트가 필요합니다.");
		}
		else {
			System.out.println(b.getName() + "은 다이어트가 필요하지 않습니다.");
		}
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		BodyData b1 = getBodyDataInstance(s);
		BodyData b2 = getBodyDataInstance(s);
		
		printHeightMsg(b1, b2);
		printDietMsg(b1);
		printDietMsg(b2);
		
		s.close();
	}
}
