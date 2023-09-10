// 20220803 컴퓨터학과 정여진
public abstract class Shape {
	private int x, y;
	
	public Shape(){
		this.x = 0;
		this.y = 0;
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract int calcArea();
	
	public String toString() {
		return "타입:도형\n중심좌표:";
	}
	public String positionStr() {
		// 중심좌표를 문자열로 반환하는 메소드
		return "(" + x + "," + y + ")";
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
