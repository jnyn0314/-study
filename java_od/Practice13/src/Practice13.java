import java.util.Scanner;
public class Practice13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("컴퓨터의 생성:");
		String s1 = sc.next();
		
		System.out.println("당신의 입력:");
		String s2 = sc.next();
		
		if(s1.equals(s2) == true) {
			System.out.println("비겼습니다.\n");
		}
		else if(s1.equals("가위") && s2.equals("보")) {
			System.out.println("컴퓨터가 이겼습니다.\n");
		}
		else if(s1.equals("가위") && s2.equals("바위")) {
			System.out.println("당신이 이겼습니다.\n");
		}
		else if(s1.equals("보") && s2.equals("바위")) {
			System.out.println("컴퓨터가 이겼습니다.\n");
		}
		else if(s1.equals("보") && s2.equals("가위")) {
			System.out.println("당신이 이겼습니다.\n");
		}
		else if(s1.equals("바위") && s2.equals("가위")) {
			System.out.println("컴퓨터가 이겼습니다.\n");
		}
		else if(s1.equals("바위") && s2.equals("보")) {
			System.out.println("당신이 이겼습니다.\n");
		}
		sc.close();
	}

}
