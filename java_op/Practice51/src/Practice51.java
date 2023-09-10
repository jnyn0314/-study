// 20220803 컴퓨터학과 정여진
import java.util.Random;

public class Practice51 {

	public static void main(String[] args) {
	
		int count0  = 0, count9 = 0;
		for(int j = 0; j < 10; j++) {
		for(int i = 0; i < 10; i++) {
			Random rd = new Random();
			int x = rd.nextInt(10000) + 1000;
			if(x == 1000) {
				System.out.print("1000*\t");
				count0++;
			}
			else if(x >= 9999) {
			System.out.print("9999+\t");
			count9++;
			}else
			System.out.print(x + "\t");
		}
		System.out.println("");
		}
		System.out.println("# of 1000 :" + count0);
		System.out.println("# of 9999: " + count9);
	}

}
