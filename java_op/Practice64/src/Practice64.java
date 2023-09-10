// 20220803 컴퓨터학과 정여진

public class Practice64 {

	public static void main(String[] args) {
		int i = 1;

		Dice dice1 = new Dice();
		Dice dice2 = new Dice();

		do
		{
		dice1.roll();
		dice2.roll();
		
		System.out.println(i + "차: 첫번째 주사위 = " + dice1.toString() + ", 두번째 주사위 = " + dice2.toString());
		i++;
		} while(dice1.getValue() != dice2.getValue());
		
		System.out.println("게임이 종료되었습니다.");
	}
}
