// 20220803 컴퓨터학과 정여진
public class Shape {
	private int x, y;
	public Shape() {
		this.x = 0;
		this.y = 0;
	} // 매개변수 없는 생성자, 중심좌표는 모두 0으로 설정
	public String toString() {
		String rslt = "도형::중심좌표( " + x + y + ")";
		return rslt;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
