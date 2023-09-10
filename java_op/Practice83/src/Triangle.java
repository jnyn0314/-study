public class Triangle extends Shape{
	private int base, height;
	public Triangle() {
		super();
		this.base = 0;
		this.height = 0;
	} // 초기화
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	@Override
	public double calcArea() {
		return base * height * 1/2;
	}
	public String toString() {
		return "타입:삼각형\n중심좌표:" +",밑변:" + base + ",세로:" + height + ",면적:" + calcArea();
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
