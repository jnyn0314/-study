import java.util.Scanner;
public class Practice15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("컴퓨터의 생성:");
		String com = sc.next();
		
		System.out.println("당신의 입력:");
		String you = sc.next();
	
		if(whoswin(com, you) == -1) {
			System.out.println("컴퓨터가 이겼습니다.\n");
		}
		else if(whoswin(com, you) == 0) {
			System.out.println("비겼습니다.\n");
		}
		else if(whoswin(com, you) == 1) {
			System.out.println("당신이 이겼습니다.\n");
		}
		sc.close();
	}

public static int whoswin(String com, String you) {
	if(com.equals(you) == true) {
		return 0;
	}
	else if(com.equals("가위") && you.equals("보")) {
		return -1;
	}
	else if(com.equals("가위") && you.equals("바위")) {
		return 1;
	}
	else if(com.equals("보") && you.equals("바위")) {
		return -1;
	}
	else if(com.equals("보") && you.equals("가위")) {
		return 1;
	}
	else if(com.equals("바위") && you.equals("가위")) {
		return -1;
	}
	else if(com.equals("바위") && you.equals("보")) {
		return 1;
	}
	else return 2;
	}
}
