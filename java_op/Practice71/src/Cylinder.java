// 20220803 컴퓨터학과 정여진
// this() 최대한 쓰고?

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {
		this.height = 0;
	}
	public Cylinder(double radius) {
		super(radius);
	}
	public Cylinder(double radius, double height) {
		super();
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return getArea() * height;
	}
}
