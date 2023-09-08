import java.util.Scanner;
public class Practice03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인치 값을 입력하세요");
		
		float inch = sc.nextFloat();
		int centi = (int)(2.54 * inch);
		
		System.out.println("해당하는 센티미터 값은" + centi + "입니다.");
		
		sc.close();
	}

}
