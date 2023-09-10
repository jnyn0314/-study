// 20220803 컴퓨터학과 정여진

public class Plane {
	private int id;
	private String model;
	private int capacity;
	
	public String toString() {
		String rslt = "식별번호: " + id + "편\n모델:" + model + "\n승객수: " + capacity + "명\n";
		return rslt;
	}
	public void setId(int id) {this.id = id;}
	public void setModel(String model) {this.model = model;}
	public void setCapacity(int capacity) {this.capacity = capacity;}

	public Plane() {
		this(0, "모름", 0);
	}
	public Plane(int id, String model, int capacity) {
		this.id = id;					
		this.model = model;
		this.capacity = capacity; // 생성자 정의 내부에서 설정자 사용
	}
}


 