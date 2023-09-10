// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		String alphabet;
		String vowelsOrCons = null, 모음 = null, 자음 = null;
		
		System.out.print("문자를 입력하세요: ");
		alphabet = sc.next();
		
		switch (alphabet) {
			case "a":	
			case "e":	
			case "i":	
			case "o":	
			case "u":	
			case "A":	
			case "E":	
			case "I":	
			case "O":	 
			case "U":
			System.out.print("모음입니다."); 
			break;
			default:	
			System.out.print("자음입니다.");
			break;
		}
		sc.close();
	}

}
