// 20220803 컴퓨터학과 정여진
public class MaterialBox extends Box{
	String attribute;
	
	public MaterialBox() {
		this(0, 0, 0, "");
	}
	public MaterialBox(int x, int y, int z, String attribute){
		super(x, y, z); 
		this.attribute = attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	String attribute() {
		return attribute;
	}
	public double getWeight() {
	if(attribute.equals("paper"))	
		return 1.5 * getVolume();
	else if(attribute.equals("wood"))
		return 2.5 * getVolume();
	else
		return 1.1 * getVolume();
	}
	public String printInfo() {
		return super.toString() + "\n재질:" +attribute;
	// 가로, 세로, 높이, 재질 정보를 문자열로 리턴
	// return super.toString() + "\n재질:" +attribute;
	} // 생성자 지웠으니까 get set 안돼
}