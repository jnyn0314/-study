
public class Potato extends Food{

	public int getUnitPrice() {
		double Unitprice = price / weight;
			return (int)Unitprice;
		}
	public String toString() {
		return "칼로리: " + calory +"\n가격: " + price + "\n무게: " + weight + "\n단위가격: " + getUnitPrice();
 }
}