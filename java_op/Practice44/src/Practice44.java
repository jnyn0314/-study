// 20220803 컴퓨터학과 정여진
import java.util.Scanner;

public class Practice44 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		Average info = new Average();
		
		System.out.print("원하는 기능을 선택하세요(1-정수, 2-실수)");
		int type = sc.nextInt();
		System.out.print("평균값을 원하는 정수의 개수를 입력하세요.");
		int num = sc.nextInt(); 
		
		int[] n = new int[3];
		for(int i = 0; i < num; i++) {
		System.out.print((i + 1) +"번 정수를 입력하세요.");
		n[i] = sc.nextInt();
		}
		double rslt = 0;
		
		if(type == 1 || num == 2)
			 rslt = info.getAverage(n[0], n[1]);
		else if(type == 1 || num == 3)
			rslt = info.getAverage(n[0], n[1], n[2]);
		else if(type == 2 || num == 2)
			rslt = info.getAverage(n[0], n[1]);
		else if(type == 2 || type == 3)
			rslt = info.getAverage(n[0], n[1], n[2]);
		System.out.println(num + "개 정수의 평균은" + rslt);
		
		sc.close();
	}

}
