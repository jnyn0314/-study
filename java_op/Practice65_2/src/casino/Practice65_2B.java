// 20220803 컴퓨터학과 정여진
package casino;
public class Practice65_2B{

	public static void main(String[] args) {
		int i = 1;
		
		game.Dice dice1 = new game.Dice(); // 여기 오류!! 왜? game.Dice()로 써줘야 돼 
		game.Dice dice2 = new game.Dice();
		
		do {
			dice1.roll();
			dice2.roll();
			System.out.println(i + "차: 첫번째 " + dice1.toString() + ", 두번째 " + dice2.toString());
			i++;
		}while (dice1.getValue() != dice2.getValue());
		
		System.out.println("게임이 종료되었습니다.");
	}
}
