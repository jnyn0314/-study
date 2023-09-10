package nofruit;

import fruit.Food;
import fruit.Melon; // 이거 두개로 Food, Melon에 접근 가능, 대신 calory등 소속 변수나 메소드에는 아직 접근 불가 => getter, setter 이용해야 돼

public class Practice68_2 {
	public static void main(String[] args) {
	Food f0 = new Food();
	Melon f1 = new Melon();
	Potato f2 = new Potato();
	
	f0.setCalory(100);
	f0.setPrice(100);
	f0.setWeight(12.3);
		
	f0.calory = 100; // int로 정의됐으니까 다른 패키지인 nofruit에서는 접근 불가능  
	f0.price = 100; // protected으로 정의됐으니까 다른 패키지면서 동시에 자식 메소드가 아닌 메인 메소드에서는 오류
	f0.weight = 12.3;
	
	f1.calory = 200;
	f1.price = 200;
	f1.weight = 5.5;
	f1.farmInfo = "좋은 이웃들";
	
	f2.calory = 300;
	f2.price = 200;
	f2.weight = 50.0;
	
	System.out.println("음식의 정보입니다.");
	System.out.println(f0.toString() + "\n");
	System.out.println("멜론의 정보입니다.");
	System.out.println(f1.toString() + "\n");
	System.out.println("감자의 정보입니다.");
	System.out.println(f2.toString() + "\n");
	System.out.println("감자의 단위가격은 " + f2.getUnitPrice() + "입니다.");
	}
}
