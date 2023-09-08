import java.util.Scanner;
import java.util.ArrayList;
public class Practice70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double> list = new ArrayList<Double>();
		
		int size = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
			list.add(sc.nextDouble());
		}
		
		
		sc.close();
	}
	public static Double findMax(ArrayList<Double> scores) {
		double min  = scores.get(0);
		
		for(int i = 0; i <scores.size(); i++) {
			if(min < scores.get(i))
				min = scores.get(i);
		}
		scores.remove(min);
		return min;
	}
	public static Double findMin(ArrayList<Double> scores) {
		
	}
	public static Double getAvg(ArrayList<Double> scores) {
		
	}
}
