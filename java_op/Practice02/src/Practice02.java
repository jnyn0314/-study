// // 컴퓨터학과 20220803 정여진
import java.util.Scanner;
public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int width, height;
		
		System.out.print("가로 길이 : ");
		width = 10;
		System.out.print(width + "\n");
		
		System.out.print("세로 길이 : ");
		height = 20;
		System.out.print(height + "\n");
		
		System.out.println("사각형의 넓이: " + (width * height));
		
		sc.close();
	}

}
