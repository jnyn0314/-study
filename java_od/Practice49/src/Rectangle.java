// 20220803 컴퓨터학과 정여진
public class Rectangle extends Shape implements Moveable{
	private double length;
	private double width;
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	public Rectangle(double length) {
		super();
		this.length = length;
	}
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double calcArea() {
		double area;
		area = width * length;
		return area;
	}
	
	public String toString() {
		String rslt;
		rslt = "중심좌표: (" + getX() + "," + getY() + "), 가로 : " + String.format("%.2f", width) + ", 세로: " + String.format("%.2f", length) + ", 면적 : " + String.format("%.2f", calcArea()); 
		return rslt;
	}
	
	public void move(int dx, int dy) {
		super.move(dx, dy); // shape 클래스에서 구현한 move 메소드 호출
		setX(getX() + dx);
		setY(getY() + dy);
	}
	public void draw() {
		System.out.println("사각형, " + toString());
	}
}