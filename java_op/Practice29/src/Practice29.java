// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
import java.util.Random;
public class Practice29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int i;
		int[] s = new int[20];
		for(i = 0; i < s.length; i++)
			s[i] = random.nextInt(100);
		displayArray(s);
		findMax(s);
		
		sc.close();
	}
	public static void displayArray(int[] iArray) {
		int i;
		System.out.println("생성된 난수는 다음과 같습니다.");
		
		for(i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + "\t");
			}
		}
	public static int findMax(int[] iArray){
		int max = - 99999999;
		int i;
		
		for(i = 0; i < iArray.length; i++)
			if(iArray[i] > max)
				max = iArray[i];
		
		System.out.println("\n가장 큰 숫자는 " + max + "입니다.");
		
		return 0; // 왜 안쓰면 오류나는지?
	}
}
