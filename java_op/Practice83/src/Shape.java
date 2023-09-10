// 20220803 컴퓨터학과 정여진
public abstract class Shape {
	private int x, y;
	protected String type;
	
	public Shape(){
		this.x = 0;
		this.y = 0;
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double calcArea();
	
	public String toString() {
		return "중심좌표:(" + x + "," + y + "),";
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
}
