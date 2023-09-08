import java.util.HashSet;
public class Practice72 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();

		set.add("5");
		set.add("4");
		set.add("6");
		
		System.out.println(set);
		
		for(String s : set) {
			System.out.println(s);
		}
		
	}
}
