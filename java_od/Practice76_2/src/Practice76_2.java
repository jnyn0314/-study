import java.util.Scanner;
public class Practice76_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		Movie[] m = new Movie[size];
		
		for(int i = 0; i < size; i++) {
			String name = sc.next();
			String dir = sc.next();
		
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			Date d = new Date(year, month, day);
			m[i] = new Movie(name, dir, d);
		}
		sc.close();
	}

}
