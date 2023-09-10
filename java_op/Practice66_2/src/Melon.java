// 20220803 컴퓨터학과 정여진
public class Melon extends Food{
	public String farmInfo;	
	
	public String toString() {
		String rslt = "칼로리: " + calory + "\n가격: " + price + "\n무게: " + weight  + "\n재배농장:" + farmInfo;
		return rslt;
	}
}
