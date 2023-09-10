package Fruit;

public class Melon extends Food{
	String farmInfo;

	public String getFarmInfo() {return farmInfo;};
	public void setFarmInfo(String farmInfo) {this.farmInfo = farmInfo;};

	public String toString() {
		return "칼로리: " + calory +"\n가격: " + price + "\n무게: " + weight + "\n재배농장: " + farmInfo;
	}
}
