// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice60 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String com = getVaildInput(sc);
		String you = getVaildInput(sc);
		
		
	}
	public static int whoswin(String com, String you) {
		if(com.equals(you)) {
			return 0;
		}
		else if(com.equals("가위")) {
			if(you.equals("바위"))
				return 1;
			else if(you.equals("보")) {
				return -1;
			}
		}
		else if(com.equals("바위")) {
			if(you.equals("보"))
				return 1;
			else if(you.equals("가위")) {
				return -1;
			}
		}
		else if(com.equals("보")) {
			if(you.equals("가위"))
				return 1;
			else if(you.equals("바위")) {
				return -1;
			}
		}
		return 0;
	}
	public static String getInput(Scanner s) throws InvaildInputException{
		String input = s.next();
		
		if(input.equals("가위") || input.equals("바위") || input.equals("보")) {
			return input;
		}
		else {
			throw (new InvaildInputException());
		}
	}
	public static String getvaildInput(Scanner sc) {
		boolean isDone = true;
		String input ="";
		
		while(isDone == false) {
			try {
				input = getInput(sc);
				isDone = true;
			}catch(InvaildInputException e) {
				e.getMessage();
				continue;
			}
		}
		return input;
	}
}