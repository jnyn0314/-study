// 20220803 컴퓨터학과 정여진
public class Practice66_2 {

	public static void main(String[] args) {
		Food f0 = new Food();
		Melon f1 = new Melon();
		Potato f2 = new Potato();
		
		System.out.println("음식의 정보입니다.\n");
		// System.out.print(f0.toString(100, 20, 100)); 이렇게 할 꺼면 toString(int price,,,) 이런 식으로 정의해야 되는데 
		// 그러면 상속이 안돼 FOOD -> MELON
		// 따라서 그냥 f0.price = 100; 이런 식으로 main에서 정의해주는 수밖에... 
	}
}
