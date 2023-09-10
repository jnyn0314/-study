// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, i, cnt = 0;
		
		System.out.print("정수를 하나 입력하세요: ");
		num = sc.nextInt();
		
		for(i = 0; i <= num; i++) {
			System.out.print(i + "\t");
			i += 2;
			cnt++;
			if(cnt == 5) {
				System.out.print("\n");
				cnt = 0;
			}
		}
		sc.close();	
	}

}
