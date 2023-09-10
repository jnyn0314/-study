// 20220803 컴퓨터학과 정여진
public class Box {
	private int x;
	private int y;
	private int z;
	/*
	public Box() {
		this(0, 0, 0);
	}*/ //매개변수 없는 생성자 제거
	public Box(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() { // 수정
		return "가로:" + x + "cm\n세로:" + y + "cm\n높이:" + z + "cm\n";
	}
	public int getVolume() {
		return x * y * z;
	}
	public double getWeight() {
		return 1.1 * getVolume();
	}
}
