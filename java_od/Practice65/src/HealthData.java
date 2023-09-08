// 20220803 컴퓨터학과 정여진
public class HealthData<H, W> {
	private String name;
	private W weight;
	private H height;
	
	public HealthData(String name,H height, W weight){
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	void setWeight(W weight) {
		this.weight = weight;
	}
	public W getWeight() {
		return weight;
	}
	void setHeight(H height) {
		this.height = height;
	}
	public H getHeight() {
		return height;
	}
	
	public String toString() {
		return "(" + name + ", " + height + ", " + weight + ")";
	}
}
