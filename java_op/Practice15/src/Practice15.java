// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, num = 1;
		
		// for 루프 사용
		for(j = 0; j < 7; j++) {
		for(i = 0; i < 5; i++) {
			System.out.print(num + "\t");
			num += 3;
			if(num > 100)
				break;
		}
		System.out.print("\n");
		}
		
		System.out.print("\n");
		
		num = 1;
		i = 0;
		j = 0;
		
		// while 루프 사용
		while(j < 7) {
		while(i < 5) {
			System.out.print(num + "\t");
			num += 3;
			i++;
			if(num > 100)
				break;
		}
		System.out.print("\n");
		j++;
		i = 0;
		}
		
		sc.close();
	}

}
