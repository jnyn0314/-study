// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] s;
		int i;
		s = new int[5];
		int max = -999999;
		
		for(i = 0; i < s.length; i++) {
			System.out.print((i+1) +"번째 숫자를 입력하세요:");
			s[i] = sc.nextInt();
		}
		System.out.println("입력된 숫자는 다음과 같습니다.");
		
		for(i = 0; i < s.length; i++)
			System.out.print(s[i]);
		
		System.out.println("\n역순 출력입니다.\n");
		
		for(i = 0; i < s.length; i++)
			System.out.print(s[5 - 1 - i]); //  여기서 index - 1 - i인게 중요
		
		for(i = 0; i < s.length; i++)
			if(s[i] > max)
				max = s[i];
		
		System.out.println("가장 큰 수는" + max + "입니다.");
		sc.close();
	}

}
