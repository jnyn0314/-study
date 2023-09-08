// 20220803 컴퓨터학과 정여진
public class Rectangle extends Shape{
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
	
	public Double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Double getWidth() {
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
		rslt = "중심좌표: (" + getX() + "," + getY() + "), 가로 : " + width + ", 세로: " + length + ", 면적 : " + calcArea(); 
		return rslt;
	}
}