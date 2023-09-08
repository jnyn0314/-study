
import java.util.Scanner;
public class Practice02 {

	public static void main(String[] args) {
				
		System.out.println("화씨 온도를 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
	
		int fahren = sc.nextInt();
		float cels = (float)(5/9) * (fahren - 32);
		
		String str = String.format("%.2f", cels);
		
		System.out.println("해당하는 섭씨 온도는 " + str + "입니다.");
		
		sc.close();
	}
} // 왜 틀림? printf 안쓰고 println써서는 어케 해?
/*
import java.util.Scanner;
 
public class Practice02 {
 
    public static void main(String[] args) {
 
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("화씨온도를 입력하세요 : ");
        int        fahrenheit = scanner.nextInt();
        
        float celcius = (float)5/9 * (fahrenheit-32);
        System.out.printf("해당하는 섭씨 온도는 %.2f입니다." , celcius);
        scanner.close();       
 
    }
 
}
*/