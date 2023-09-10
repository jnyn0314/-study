// 20220803 컴퓨터학과 정여진
public class Food {
	int calory;
	protected int price;
	protected double weight;
	
	public String toString() { 
		String rslt = "칼로리: " + calory + "\n가격: " + price + "\n무게: " + weight;
		return rslt;
	}
}
