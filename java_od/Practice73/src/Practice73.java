import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Practice73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Config c = new Config();
		try {
		c = getInput();
		}catch(ImproperKeyValueException e) {
			e.getMessage();
		}
		int size = sc.nextInt();
		int range =sc.nextInt();
		int key = sc.nextInt();
		
		
		
		sc.close();
	}
	public static void printArray10PerLine(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list);
		}
	}
	public static ArrayList<Integer> getRandomList(int size, int range){
		ArrayList<Integer> before = new ArrayList<Integer>();
		for(int i = 0; i < range; i++) {
			before.add(i);
		}
		Collections.shuffle(before);
		ArrayList<Integer> after = new ArrayList<Integer>();
		for(int i = 0; i < size; i++) {
			after.add(before.get(i));
		}
		return after;
	}
	public static Config getInput() throws ImproperKeyValueException {
		Scanner sc = new Scanner(System.in);
		Config c = new Config();
		
		c.setKey(sc.nextInt());
		c.setRange(sc.nextInt());
		c.setRange(sc.nextInt());
		
		if(c.getKey()> c.getRange()) {
			throw new ImproperKeyValueException();
		}
		
		sc.close();
		return c;
	}
	private static boolean searchArray(ArrayList<Integer>list, Integer key) {
		
	}
}
