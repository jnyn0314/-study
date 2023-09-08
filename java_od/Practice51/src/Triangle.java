// 20220803 컴퓨터학과 정여진
public class Triangle extends Shape implements Moveable{
	private double base;
	private double height;
	
	public Triangle() {
		base = 0;
		height = 0;
	}
	public Triangle(double base) {
		super();
		this.base = base;
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public Double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double calcArea() {
		double area;
		area = (double)1/2 * (base + height); 
		return area;
	}
	
	public String toString() {
		String rslt;
		rslt = "중심좌표: (" + getX() + "," + getY() + "), 밑변: " + base + ", 높이: " + String.format("%.2f", height) + ", 면적: " + String.format("%.2f", calcArea());
		return rslt;
	}
	public void move(int dx, int dy) {
		super.move(dx, dy);
		setX(getX() + dx);
		setY(getY() + dy);
	}
	public void draw() {
		System.out.println("삼각형, " + toString());
	}
}