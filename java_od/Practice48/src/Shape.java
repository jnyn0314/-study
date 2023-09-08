// 20220803 컴퓨터학과 정여진
public class Shape implements Moveable{
	private int x, y;
	
	public Shape() {
		x = 0;
		y = 0;
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
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
	
	public double calcArea() {
		return -1;
	} // -1 반환
	
	public String toString() {
		String rslt;
		rslt = "중심좌표 :(" + x + "," + y + ")";
		return rslt;
	}
	
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
}
