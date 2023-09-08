import java.util.Scanner;
public class Practice16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int win = 0, lose = 0, same = 0;
		String you = null;
		
		do {
			System.out.println("현재 당신의 전적:" + win + "승 " + lose + "패 " + same + "무");
		
			System.out.println("컴퓨터의 입력:");
			String com = sc.next();
			
			System.out.println("당신의 입력:");
			you = sc.next();
			
			if(whoswin(com, you) == 0) {
				System.out.println("비겼습니다.");
				same++;
			}
			if(whoswin(com, you) == 1) {
				System.out.println("당신이 이겼습니다.");
				win++;
			}
			if(whoswin(com, you) == -1) {
				System.out.println("컴퓨터가 이겼습니다.");
				lose++;
			}
		}while(!you.equals("그만"));		
		System.out.println("프로그램을 종료합니다.");
		
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
