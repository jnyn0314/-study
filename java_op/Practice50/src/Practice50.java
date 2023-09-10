// 20220803 컴퓨터학과 정여진
public class Practice50 {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		b1.fillBox();
		System.out.println("디폴트 상자의 정보입니다.");
		System.out.print(b1.toString());
		
		Box b2 = new Box();
		b2.setX(30);
		b2.setY(45);
		b2.setZ(53);
		b2.emptyBox();
		System.out.println("\n첫번째 상자의 정보입니다.");
		System.out.print(b2.toString());
		
		Box b3 = new Box(100, 60, 20);
		b3.fillBox();
		System.out.println("\n두번째 상자의 상자의 정보입니다.");
		System.out.print(b3.toString());
	}

}
