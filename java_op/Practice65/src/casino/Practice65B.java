package casino;

public class Practice65B {

	public static void main(String[] args) {

			int i = 1;

			game.Dice dice1 = new game.Dice();
			game.Dice dice2 = new game.Dice();

			do
			{
			dice1.roll();
			dice2.roll();

			System.out.println(i + "차: 첫번째 " + dice1.toString() + ", 두번째 " + dice2.toString());
			i++;
			} while (dice1.getValue() != dice2.getValue());
			
			System.out.println("게임이 종료되었습니다.");
	}
}
