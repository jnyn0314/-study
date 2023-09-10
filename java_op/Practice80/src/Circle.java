// 20220803 컴퓨터학과 정여진
public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		this(0);
	}
	public Circle(double radius) {
		this(0, 0, 0.0);
	}
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius * radius * 3.14;
	}
	public String toString() {
		return "중심좌표:(" + getX()  + getY() + ")\n반지름:" + radius + "\n단면적: " + getArea();
	}
}
