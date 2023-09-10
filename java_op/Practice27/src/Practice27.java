// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, j, max = -999999;
		int[] s = new int[5];
		int[] count = new int[10];
		
		for(i = 0; i < s.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요:");
			s[i] = sc.nextInt();
			}
		System.out.println("입력된 숫자는 다음과 같습니다.");
		
		for(i = 0; i < s.length; i++)
			System.out.print(s[i]);
		
		System.out.println("\n역순 출력입니다.");
		
		for(i = 0; i < s.length; i++)
			System.out.print(s[4 - i]);
		
		for(i = 0; i < s.length; i++)
			if(s[i] > max)
				max = s[i];
		
		System.out.println("\n가장 큰 수는" + max + "입니다.");
		for(i = 0; i < s.length; i++)
		for(j = 0; j < count.length; j++)
			if(j == s[i])
				count[j]++;
		
		System.out.println("숫자 별로 입력된 횟수는 다음과 같습니다.");
		for(j = 0; j < count.length; j++)
			System.out.println("숫자" + j + ":" + count[j] + "번");
		
		sc.close();
	}

}
