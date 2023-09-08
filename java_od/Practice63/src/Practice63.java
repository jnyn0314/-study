// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MyBox에 저장할 내용을 입력하세요:");	
		String s = sc.next();
		MyBox<String> b1 = new MyBox<String>(s);	
		System.out.println("MyBox에 저장된 내용 :" + b1.get());
		
		System.out.println("MyBox에 저장할 내용을 입력하세요:");	
		s = sc.next();
		b1.set(s);
		System.out.println("MyBox에 저장된 내용 :" + b1.get());
		
		int num1 = sc.nextInt();
		MyBox<Integer> b2 = new MyBox<Integer>(num1);
		System.out.println("MyBox에 저장할 내용을 입력하세요:");	
		System.out.println("MyBox에 저장된 내용 :" + b2.get());
		
		int num2 = sc.nextInt();
		MyBox<Integer> b3 = new MyBox<Integer>(num2);
		System.out.println("MyBox에 저장할 내용을 입력하세요:");
		System.out.println("MyBox에 저장된 내용 :" + b3.get());
		
		int sum = b2.get() + b3.get();
		
		System.out.println(sum);
			
		sc.close();
	}
}
