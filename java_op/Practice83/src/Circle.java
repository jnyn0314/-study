
public class Circle extends Shape {
	private int radius;
	@Override
	public double calcArea() {
		return radius * radius * 3.14;
	}
	public String toString() {
		return "타입:원\n중심좌표:(" + getX() + "," + getY() + "), 반지름:" + radius + ",면적:" + calcArea();
	}
}
