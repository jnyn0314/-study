// 20220803 컴퓨터학과 정여진
public class Point {
	private int x, y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public String toString() {
		String rslt = "중심좌표 :(" + x + ", " + y + ")";  
		return rslt;
	}
}
