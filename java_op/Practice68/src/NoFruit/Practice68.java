package NoFruit;
import Fruit.*;

public class Practice68 {

	public static void main(String[] args) {
		Food f0 = new Food();
		Melon f1 = new Melon();
		Potato f2 = new Potato();
		
		f0.setCalory(100);
		f0.setPrice(100);
		f0.setWeight(12.3);

		f1.setCalory(200);
		f1.setPrice(200);
		f1.setWeight(5.5);
		f1.setFarmInfo("좋은 이웃들");

		f2.setCalory(300);
		f2.setPrice(200);
		f2.setWeight(50.0);

		System.out.println("음식의 정보입니다.");
		System.out.println(f0.toString() + "\n");
		System.out.println("멜론의 정보입니다.");
		System.out.println(f1.toString() + "\n");
		System.out.println("감자의 정보입니다.");
		System.out.println(f2.toString() + "\n");
		System.out.println("감자의 단위가격은 " + f2.getUnitPrice() + "입니다.");
	}
}
