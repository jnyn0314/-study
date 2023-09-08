// 20220803 컴퓨터학과 정여진
public class Circle {
	private Point center;
	private int radius;
	
	public Circle() {
		center = new Point();
		center.setX(0);
		center.setY(0);
		radius = 0;
	}
	public Circle(int x, int y, int radius) {
		center = new Point();
		center.setX(x);
		center.setY(y);
		this.radius = radius;
	}
	public Circle(Point p, int radius) {
		center = p;
		this.radius = radius;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Point getCenter() {
		return center;
	}
	public int getRadius() {
		return radius;
	}
	
	public String toString() {
		String rslt = center.toString() + "\t" + radius;
		return rslt;
	}
	
}
