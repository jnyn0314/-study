// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice59 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String com = "";
		String you = ""; //null -> nullPointerException 뜰까봐 ㅜㅜ
		
		try {
		System.out.println("컴퓨터의 입력:");	
		com = getInput(sc);
		}catch(InvalidInputException e) {
			System.out.println(e.getMessage());
			return;
		}
		try {
			System.out.println("당신의 입력:");
			you = getInput(sc);
		}catch(InvalidInputException e) {
			System.out.println(e.getMessage());
		}
		
		if(whosWin(com, you) == 0) {
			System.out.println("비겼습니다.");
		}
		else if(whosWin(com, you) == 1) {
			System.out.println("당신이 이겼습니다.");
		}
		else if(whosWin(com, you) == -1) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		sc.close();
	}
	public static int whosWin(String com, String you) {
		if(you.equals(com)) {
			return 0;
		}
		else {
			if(com.equals("가위")) {
				if(you.equals("바위")) {
					return 1;
				}
			}
			else if(com.equals("바위")) {
				if(you.equals("보")) {
					return 1;
				}
			}
			else if(com.equals("보")) {
				if(you.equals("가위")) {
					return 1;
				}
			}
		}
		return -1;
	}
	public static String getInput(Scanner s) throws InvalidInputException{
		// 사용자 입력을 받는 메소드
		
		String input = s.next();
		if(input.equals("가위") || input.equals("바위") || input.equals("보")) {
			return input;
		}
		throw(new InvalidInputException());
	}
}