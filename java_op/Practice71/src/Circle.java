// 2020803 컴퓨터학과 정여진
public class Circle {
	private double radius;
	
	public Circle() {
		this.radius = 0; // 모든 소속변수를 0으로 초기화
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius * radius * 3.14;
	}
	
}
