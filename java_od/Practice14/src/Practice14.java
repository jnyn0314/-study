import java.util.Scanner;
public class Practice14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("컴퓨터의 입력:");
		String com = sc.next();
		*/
		String com = null; 
		
		System.out.println("컴퓨터의 입력:");
		com = sc.next();
		
		while(!com.equals("가위") && !com.equals("바위") && !com.equals("보")) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			System.out.println("컴퓨터의 입력:");
			com = sc.next();
		}
		
		System.out.println("당신의 입력:");
		String you = sc.next();
		
		if(com.equals(you) == true) {
			System.out.println("비겼습니다.\n");
		}
		else if(com.equals("가위") && you.equals("보")) {
			System.out.println("컴퓨터가 이겼습니다.\n");
		}
		else if(com.equals("가위") && you.equals("바위")) {
			System.out.println("당신이 이겼습니다.\n");
		}
		else if(com.equals("보") && you.equals("바위")) {
			System.out.println("컴퓨터가 이겼습니다.\n");
		}
		else if(com.equals("보") && you.equals("가위")) {
			System.out.println("당신이 이겼습니다.\n");
		}
		else if(com.equals("바위") && you.equals("가위")) {
			System.out.println("컴퓨터가 이겼습니다.\n");
		}
		else if(com.equals("바위") && you.equals("보")) {
			System.out.println("당신이 이겼습니다.\n");
		}
		sc.close();
	}
}
