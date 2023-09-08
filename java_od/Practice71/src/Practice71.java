// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Practice71 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(count != 5) {
			System.out.println("숫자를 입력하세요:");
			int num = sc.nextInt();
			if(set.add(num)) {
				count++;
			}
			System.out.println(count + "개의 숫자가 입력되었습니다.");
		}
		
		System.out.println(set);
		sc.close();
	}
}
