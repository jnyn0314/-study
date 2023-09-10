// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double height, weight, normalWeight;
		
		System.out.print("키를 입력하세요: ");
		height = sc.nextDouble();
		
		System.out.print("몸무게를 입력하세요: ");
		weight = sc.nextDouble();
		
		normalWeight = (height - 100) * 0.9;
		System.out.println("표준체중은 " + normalWeight + "입니다.");

		if(weight > normalWeight)
			System.out.println("과체중입니다.");
		if(weight < normalWeight)
			System.out.println("저체중입니다.");
		else
			System.out.println("정상체중입니다.");
		
		sc.close();
		
	}

}
