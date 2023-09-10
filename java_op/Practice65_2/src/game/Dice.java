// 20220803 컴퓨터학과 정여진
// 다른 패키지에서도 사용할 수 있는 클래스로 정의 -> 뭐 써야돼?
package game;

import java.util.Random;

public class Dice {
	Random rg = new Random();
	
	private int value;
	
	public void roll() {
		value = rg.nextInt(6) + 1;
		 }
	
	public int getValue() {return value;};
	private void setValue(int value) {this.value = value;};

	public String toString() {
		return "주사위 = " + value;
		 }
	
	public Dice(){
		setValue(0);
	}
}

