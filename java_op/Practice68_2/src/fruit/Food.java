package fruit;

public class Food {
	int calory;
	protected int price;
	protected double weight;

	public String toString() {
	return "칼로리: " + calory +"\n가격: " + price + "\n무게: " + weight;
	  } // 생성자
	public Food() {
		
	} // 생성자
	// getter, setter 정의
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}

