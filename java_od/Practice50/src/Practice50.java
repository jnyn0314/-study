// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
public class Practice50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Rectangle);
		System.out.println(s instanceof Triangle);
		System.out.println(s instanceof Moveable);
		System.out.println(s instanceof Drawable);
		
		System.out.println(r instanceof Shape);
		System.out.println(r instanceof Rectangle);
		// System.out.println(r instanceof Triangle);
		System.out.println(r instanceof Moveable);
		System.out.println(r instanceof Drawable);
		
		System.out.println(t instanceof Shape);
		// System.out.println(t instanceof Rectangle);
		System.out.println(t instanceof Triangle);
		System.out.println(t instanceof Moveable);
		System.out.println(t instanceof Drawable);
		sc.close();
	}

}