// 20220803 컴퓨터학과 정여진
public class Rectangle extends Shape {
	private int length, width;
	
	public Rectangle() {
		super();
		this.length = length;
		this.width = width;
	}
	public Rectangle(int x, int y, int length, int width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}
	@Override
	public int calcArea() {
		return length * width;
	}
	public String toString() {
		return "타입:사각형\n중심좌표:(" + getX() + "," + getY() + "), 가로:" + length + ",세로:" + width + ",면적:" + calcArea();
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
