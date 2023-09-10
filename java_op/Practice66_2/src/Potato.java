// 20220803 컴퓨터학과 정여진
public class Potato extends Food{
	/*
	public int getUnitPrice() {
		// 단위 무게당 가격을 계산
		(double) price / weight;
	}
	*/
	public String toString() {
		String rslt = "칼로리: " + calory + "\n가격: " + price + "\n무게: " + weight + "\n무게: " + getUnitPrice();
		return rslt;
	}
}
