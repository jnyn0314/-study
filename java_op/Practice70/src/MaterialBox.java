// 20220803 컴퓨터학과 정여진
public class MaterialBox extends Box{
	String attribute;
	
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public String attribute() {
		return attribute;
	}
	
	public MaterialBox(int x, int y, int z, String attribute){
		super(x, y, z); 
		this.attribute = attribute;
	}
	public void printInfo() {
		System.out.println(toString()); // setter, getter없으니까 x, y, z는 box class안에서 최대한 해결!
		System.out.println("재질:" + attribute());
		System.out.println("부피:" + getVolume());
		System.out.println("무게:" + String.format("%.2f", getWeight()) + "\n");
	}
}
