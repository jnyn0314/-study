// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name1 = "김동덕";
		int height1 = 160, weight1 = 50;
		String name2 = "홍길동";
		int height2 = 180;
		double weight2 = 100.35;
		String name3 = "성춘향";
		double height3 = 156.7;
		int weight3 = 65;
		
		HealthData<Integer, Integer> hd1 = new HealthData<Integer, Integer>(name1, height1, weight1);
		System.out.println(hd1.toString());
		
		HealthData<Integer, Double> hd2 = new HealthData<Integer, Double>(name2, height2, weight2);
		System.out.println(hd2.toString());
		
		HealthData<Double, Integer> hd3 = new HealthData<Double, Integer>(name3, height3, weight3);
		System.out.println(hd3.toString());
		
		System.out.println(hd1.getWeight() + hd2.getWeight() + hd3.getWeight());
		
		sc.close();
	}

}
