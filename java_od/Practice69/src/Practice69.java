import java.util.Scanner;
public class Practice69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		RandomList<Integer> list_integer = new RandomList<Integer>();
		
		for(int i = 0; i < size; i++) {
			list_integer.add(sc.nextInt());
		}
		
		list_integer.print();
		
		
	}
}
