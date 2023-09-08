import java.util.Scanner;
public class Practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		while(num <= 0) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			num = sc.nextInt();
		}
		
		int j = 1;
		
		
		System.out.print("1\t");
		for(int i = 2; i <= num; i++) {
			if(i % 5 != 0) {
				System.out.print(i + "\t");
				j++;
				if(j % 7 == 0) {
					System.out.println();
				}
			}	
		}
		sc.close();
	}

}
