// 20220803 컴퓨터학과 정여진
public class Practice51 {

	public static void main(String[] args) {
		Moveable[] rArray = new Moveable[2];
		
		rArray[0] = new Rectangle();
		rArray[1] = new Triangle();
		
		System.out.println(rArray[0] instanceof Rectangle);
		System.out.println(rArray[0] instanceof Triangle);
		System.out.println(rArray[0] instanceof Moveable);
		System.out.println(rArray[0] instanceof Drawable);
		
		System.out.println(rArray[1] instanceof Rectangle);
		System.out.println(rArray[1] instanceof Triangle);
		System.out.println(rArray[1] instanceof Moveable);
		System.out.println(rArray[1] instanceof Drawable);
	}

}
