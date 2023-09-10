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
