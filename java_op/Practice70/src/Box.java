// 20220803 컴퓨터학과 정여진
public class Box {
	private int x;
	private int y;
	private int z;
	
	public String toString() {
		String rslt = "가로:" + x + "cm\n세로:" + y + "cm\n높이:" + z + "cm\n";
		return rslt;
	}
	// 접근자와 설정자 모두 제거
	
	public int getVolume() {
		return x * y * z;
	}
	public double getWeight() {
		return 1.1 * getVolume();
	}
	public Box(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
}
