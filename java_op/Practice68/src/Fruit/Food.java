package Fruit;

	public class Food {
		int calory;
	protected int price;
	protected double weight;

	public int getCalory() {return calory;}; //NoFruit에도 쓸 수 있게 메소드 추가하였다.
	public int getPrice() {return price;};
	public double getWeight() {return weight;};

	public void setCalory(int calory) {this.calory = calory;};
	public void setPrice(int price) {this.price = price;};
	public void setWeight(double weight) {this.weight = weight;};

	public String toString() {
		return "칼로리: " + calory +"\n가격: " + price + "\n무게: " + weight;
	}

	public Food() {
		this.calory = 0;
		this.price = 0;
		this.weight = 0; // 초기화해줘야돼!!!
	}
}
	