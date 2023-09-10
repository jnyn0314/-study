import java.util.Scanner;

// 컴퓨터학과 20220803 정여진

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int width, height;
			
			System.out.print("가로 길이 : ");
			width = sc.nextInt();
			
			System.out.print("세로 길이 : ");
			height = sc.nextInt();
			
			System.out.println("사각형의 넓이: " + (width * height));
			
			sc.close();
	}

}
