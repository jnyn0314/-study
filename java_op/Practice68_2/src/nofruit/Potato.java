package nofruit;

import fruit.Food;

public class Potato extends Food{
	public int getUnitPrice() {
		double Unitprice = price / weight;
			return (int)Unitprice;
		}
	public String toString() {
		// return "칼로리: " + calory +"\n가격: " + price + "\n무게: " + weight + "\n단위가격: " + getUnitPrice(); // 칼로리 오류남. 왜?
		// 칼로리 혼자 int형인데 오류날꺼면 오히려 protected로 정의된 나머지 변수가 오류나야되는거 아니야?
		// price랑 weight는 protected인데 => 같은 패키지랑 + 다른 패키지의 자식까지 접근 가능
		// 그럼 int(default)에서 오류가 난다는 뜻!! => default는 같은 패키지 안에서만 접근 가능, 다른 패키지에서는 아예 접근 불가능!
		
		// 이해 완료!
		// 수정 어케해야돼... => getter , setter 쓰면 접근 제어자 상관없이 접근 가능!!!
		// 즉, food에서 getter, setter 정의 후 불러오기!
		
		return "칼로리: " + getCalory() +"\n가격: " + price + "\n무게: " + weight + "\n단위가격: " + getUnitPrice();
 }
}
