import java.util.Random;
public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 10; i++) {
				int num = rd.nextInt(100);
				System.out.print(num + "\t");
			}
		System.out.println();
		}
	}
}
